package com.deepdark.lab6.data

import kotlin.math.pow
import kotlin.math.sqrt

data class DistributionBus(
    val name: String,                                               // Назва
    val loadVoltage: Double,                                        // Напруга навантаження
    val electricReceivers: List<ElectricReceiver> = emptyList(),    // Список електричних пристоїв
    val distributionBuses: List<DistributionBus> = emptyList(),     // Список розподільних шин
    var quantity: Int = 0,                                          // Кількість ЕП
    var utilizationFactor: Double? = null,                          // Коефіцієнт використання
    var powerQuantified: Double? = null,                            // n * Pн
    var powerUtilizationFactor: Double? = null,                     // n * Pн * Кв
    var reactivePowerUtilizationFactor: Double? = null,             // n * Pн * Кв * tg
    var powerQuantifiedSquared: Double? = null,                     // n * Pн * Pн
    var effectiveQuantity: Double? = null,                          // Ефективна кількість ЕП
    var activePowerFactor: Double? = null,                          // Pозрахунковий коефіцієнт активної потужності
    var activeLoad: Double? = null,                                 // Pозрахунковий активне навантаження
    var reactiveLoad: Double? = null,                               // Pозрахунковий реактивне навантаження
    var totalPower: Double? = null,                                 // Повна потужність
    var calculatedCurrent: Double? = null                           // Струм
) {
    fun calculateUnknowns() {
        if (electricReceivers.isNotEmpty()) {
            electricReceivers.forEach { it.calculateUnknowns() }

            if (distributionBuses.isEmpty()) {
                quantity = electricReceivers.sumOf { it.quantity }

                powerQuantified = electricReceivers.sumOf { it.powerQuantified ?: 0.0 }

                powerUtilizationFactor = electricReceivers.sumOf { it.powerUtilizationFactor ?: 0.0 }

                reactivePowerUtilizationFactor = electricReceivers.sumOf { it.reactivePowerUtilizationFactor ?: 0.0 }

                powerQuantifiedSquared = electricReceivers.sumOf { it.powerQuantifiedSquared ?: 0.0 }

                utilizationFactor = powerQuantified?.takeIf { it != 0.0 }?.let {
                    powerUtilizationFactor?.div(it)
                }

                effectiveQuantity = powerQuantified
                    ?.pow(2.0)
                    ?.div(powerQuantifiedSquared ?: 1.0)

                activePowerFactor = getActivePowerFactor(
                    utilizationFactor = utilizationFactor ?: 0.0,
                    effectiveQuantity = (effectiveQuantity ?: 0.0).toInt()
                )

                activeLoad = activePowerFactor?.let {
                    it * (powerUtilizationFactor ?: 0.0)
                }
                reactiveLoad = reactivePowerUtilizationFactor?.let {
                    it * (activePowerFactor ?: 1.0)
                }

                totalPower = activeLoad?.let { aLoad ->
                    reactiveLoad?.let { rLoad ->
                        sqrt(aLoad.pow(2.0) + rLoad.pow(2.0))
                    }
                }

                calculatedCurrent = activeLoad?.let { it / loadVoltage }
            }
        }

        if (distributionBuses.isNotEmpty()) {
            distributionBuses.forEach { it.calculateUnknowns() }

            utilizationFactor = powerQuantified?.takeIf { it != 0.0 }?.let {
                powerUtilizationFactor?.div(it)
            }

            effectiveQuantity = powerQuantified
                ?.pow(2.0)
                ?.div(powerQuantifiedSquared ?: 1.0)

            activePowerFactor = getActivePowerFactor(
                utilizationFactor = utilizationFactor ?: 0.0,
                effectiveQuantity = (effectiveQuantity ?: 0.0).toInt(),
                true
            )

            activeLoad = activePowerFactor?.let {
                it * (powerUtilizationFactor ?: 0.0)
            }
            reactiveLoad = reactivePowerUtilizationFactor?.let {
                it * (activePowerFactor ?: 1.0)
            }

            totalPower = activeLoad?.let { aLoad ->
                reactiveLoad?.let { rLoad ->
                    sqrt(aLoad.pow(2.0) + rLoad.pow(2.0))
                }
            }

            calculatedCurrent = activeLoad?.let { it / loadVoltage }
        }
    }
}