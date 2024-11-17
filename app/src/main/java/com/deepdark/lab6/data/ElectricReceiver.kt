package com.deepdark.lab6.data

import kotlin.math.pow
import kotlin.math.sqrt

data class ElectricReceiver(
    val name: String,                                       // Назва
    val nominalEfficiency: Double,                          // Номінальне значення коефіцієнта корисної дії ЕП (nu)
    val loadPowerFactor: Double,                            // Коефіцієнт потужності навантаження (cos φ)
    val loadVoltage: Double,                                // Напруга навантаження (Uн)
    val quantity: Int,                                      // Кількість ЕП (n)
    val nominalPower: Double,                               // Номінальна потужність (Pн)
    val utilizationFactor: Double,                          // Коефіцієнт використання (Kв)
    var reactiveCoefficient: Double,                        // Коефіцієнт реактивної потужності (tg φ)
    var powerQuantified: Double? = null,                    // n * Pн
    var powerUtilizationFactor: Double? = null,             // n * Pн * Кв
    var reactivePowerUtilizationFactor: Double? = null,     // n * Pн * Кв * tg φ
    var powerQuantifiedSquared: Double? = null,             // n * Pн * Pн
    var calculatedCurrent: Double? = null                   // Розрахунковий струм
) {
    fun calculateUnknowns() {
        powerQuantified = quantity * nominalPower

        powerUtilizationFactor = powerQuantified?.let {
            it * utilizationFactor
        }

        reactivePowerUtilizationFactor = powerUtilizationFactor?.let {
            it * reactiveCoefficient
        }

        powerQuantifiedSquared = quantity * nominalPower.pow(2)

        calculatedCurrent = powerQuantified?.let {
            it / (sqrt(3.0) * loadVoltage * loadPowerFactor * nominalEfficiency)
        }
    }
}
