package com.deepdark.lab6.data

val activePowerFactorMap = mapOf(
    1 to mapOf(0.1 to 8.00, 0.15 to 5.33, 0.2 to 4.00, 0.3 to 2.67, 0.4 to 2.00, 0.5 to 1.60, 0.6 to 1.33, 0.7 to 1.14, 0.8 to 1.0),
    2 to mapOf(0.1 to 6.22, 0.15 to 4.33, 0.2 to 3.39, 0.3 to 2.45, 0.4 to 1.98, 0.5 to 1.60, 0.6 to 1.33, 0.7 to 1.14, 0.8 to 1.0),
    3 to mapOf(0.1 to 4.06, 0.15 to 2.89, 0.2 to 2.31, 0.3 to 1.74, 0.4 to 1.45, 0.5 to 1.34, 0.6 to 1.22, 0.7 to 1.14, 0.8 to 1.0),
    4 to mapOf(0.1 to 3.24, 0.15 to 2.35, 0.2 to 1.91, 0.3 to 1.47, 0.4 to 1.25, 0.5 to 1.21, 0.6 to 1.10, 0.7 to 1.06, 0.8 to 1.0),
    5 to mapOf(0.1 to 2.84, 0.15 to 2.09, 0.2 to 1.72, 0.3 to 1.35, 0.4 to 1.16, 0.5 to 1.16, 0.6 to 1.08, 0.7 to 1.03, 0.8 to 1.0),
    6 to mapOf(0.1 to 2.64, 0.15 to 1.96, 0.2 to 1.62, 0.3 to 1.28, 0.4 to 1.14, 0.5 to 1.13, 0.6 to 1.06, 0.7 to 1.01, 0.8 to 1.0),
    7 to mapOf(0.1 to 2.49, 0.15 to 1.86, 0.2 to 1.54, 0.3 to 1.23, 0.4 to 1.12, 0.5 to 1.10, 0.6 to 1.04, 0.7 to 1.0, 0.8 to 1.0),
    8 to mapOf(0.1 to 2.37, 0.15 to 1.78, 0.2 to 1.48, 0.3 to 1.19, 0.4 to 1.10, 0.5 to 1.08, 0.6 to 1.02, 0.7 to 1.0, 0.8 to 1.0),
    9 to mapOf(0.1 to 2.27, 0.15 to 1.71, 0.2 to 1.43, 0.3 to 1.16, 0.4 to 1.09, 0.5 to 1.07, 0.6 to 1.01, 0.7 to 1.0, 0.8 to 1.0),
    10 to mapOf(0.1 to 2.18, 0.15 to 1.65, 0.2 to 1.39, 0.3 to 1.13, 0.4 to 1.07, 0.5 to 1.05, 0.6 to 1.0, 0.7 to 1.0, 0.8 to 1.0),
    12 to mapOf(0.1 to 2.04, 0.15 to 1.56, 0.2 to 1.32, 0.3 to 1.08, 0.4 to 1.05, 0.5 to 1.03, 0.6 to 1.0, 0.7 to 1.0, 0.8 to 1.0),
    14 to mapOf(0.1 to 1.94, 0.15 to 1.49, 0.2 to 1.27, 0.3 to 1.05, 0.4 to 1.02, 0.5 to 1.0, 0.6 to 1.0, 0.7 to 1.0, 0.8 to 1.0),
    15 to mapOf(0.1 to 1.90, 0.15 to 1.46, 0.2 to 1.25, 0.3 to 1.03, 0.4 to 1.01, 0.5 to 1.0, 0.6 to 1.0, 0.7 to 1.0, 0.8 to 1.0),
    16 to mapOf(0.1 to 1.85, 0.15 to 1.43, 0.2 to 1.23, 0.3 to 1.02, 0.4 to 1.0, 0.5 to 1.0, 0.6 to 1.0, 0.7 to 1.0, 0.8 to 1.0),
    18 to mapOf(0.1 to 1.78, 0.15 to 1.39, 0.2 to 1.19, 0.3 to 1.0, 0.4 to 1.0, 0.5 to 1.0, 0.6 to 1.0, 0.7 to 1.0, 0.8 to 1.0),
    20 to mapOf(0.1 to 1.72, 0.15 to 1.35, 0.2 to 1.16, 0.3 to 1.0, 0.4 to 1.0, 0.5 to 1.0, 0.6 to 1.0, 0.7 to 1.0, 0.8 to 1.0),
    25 to mapOf(0.1 to 1.60, 0.15 to 1.27, 0.2 to 1.10, 0.3 to 1.0, 0.4 to 1.0, 0.5 to 1.0, 0.6 to 1.0, 0.7 to 1.0, 0.8 to 1.0),
    30 to mapOf(0.1 to 1.51, 0.15 to 1.21, 0.2 to 1.05, 0.3 to 1.0, 0.4 to 1.0, 0.5 to 1.0, 0.6 to 1.0, 0.7 to 1.0, 0.8 to 1.0),
    35 to mapOf(0.1 to 1.44, 0.15 to 1.16, 0.2 to 1.0, 0.3 to 1.0, 0.4 to 1.0, 0.5 to 1.0, 0.6 to 1.0, 0.7 to 1.0, 0.8 to 1.0),
    40 to mapOf(0.1 to 1.40, 0.15 to 1.13, 0.2 to 1.0, 0.3 to 1.0, 0.4 to 1.0, 0.5 to 1.0, 0.6 to 1.0, 0.7 to 1.0, 0.8 to 1.0),
    50 to mapOf(0.1 to 1.30, 0.15 to 1.07, 0.2 to 1.0, 0.3 to 1.0, 0.4 to 1.0, 0.5 to 1.0, 0.6 to 1.0, 0.7 to 1.0, 0.8 to 1.0),
    60 to mapOf(0.1 to 1.25, 0.15 to 1.03, 0.2 to 1.0, 0.3 to 1.0, 0.4 to 1.0, 0.5 to 1.0, 0.6 to 1.0, 0.7 to 1.0, 0.8 to 1.0),
    80 to mapOf(0.1 to 1.16, 0.15 to 1.0, 0.2 to 1.0, 0.3 to 1.0, 0.4 to 1.0, 0.5 to 1.0, 0.6 to 1.0, 0.7 to 1.0, 0.8 to 1.0),
    100 to mapOf(0.1 to 1.0, 0.15 to 1.0, 0.2 to 1.0, 0.3 to 1.0, 0.4 to 1.0, 0.5 to 1.0, 0.6 to 1.0, 0.7 to 1.0, 0.8 to 1.0)
)

val activePowerFactorLowVoltageMap = mapOf(
    1 to mapOf(0.1 to 8.00, 0.15 to 5.33, 0.2 to 4.00, 0.3 to 2.67, 0.4 to 2.00, 0.5 to 1.60, 0.6 to 1.33, 0.7 to 1.14),
    2 to mapOf(0.1 to 5.01, 0.15 to 3.44, 0.2 to 2.69, 0.3 to 1.90, 0.4 to 1.52, 0.5 to 1.24, 0.6 to 1.11, 0.7 to 1.0),
    3 to mapOf(0.1 to 2.40, 0.15 to 2.17, 0.2 to 1.8, 0.3 to 1.42, 0.4 to 1.23, 0.5 to 1.14, 0.6 to 1.08, 0.7 to 1.0),
    4 to mapOf(0.1 to 2.28, 0.15 to 1.73, 0.2 to 1.46, 0.3 to 1.19, 0.4 to 1.06, 0.5 to 1.04, 0.6 to 1.01, 0.7 to 0.97),
    5 to mapOf(0.1 to 1.31, 0.15 to 1.12, 0.2 to 1.02, 0.3 to 1.0, 0.4 to 0.98, 0.5 to 0.96, 0.6 to 0.94, 0.7 to 0.93),
    6 to mapOf(0.1 to 1.20, 0.15 to 1.00, 0.2 to 0.96, 0.3 to 0.95, 0.4 to 0.93, 0.5 to 0.92, 0.6 to 0.92, 0.7 to 0.91),
    9 to mapOf(0.1 to 1.10, 0.15 to 0.97, 0.2 to 0.91, 0.3 to 0.91, 0.4 to 0.91, 0.5 to 0.90, 0.6 to 0.90, 0.7 to 0.90),
    11 to mapOf(0.1 to 1.10, 0.15 to 0.8, 0.2 to 0.80, 0.3 to 0.91, 0.4 to 0.91, 0.5 to 0.90, 0.6 to 0.90, 0.7 to 0.90),
    26 to mapOf(0.1 to 0.80, 0.15 to 0.75, 0.2 to 0.75, 0.3 to 0.85, 0.4 to 0.85, 0.5 to 0.85, 0.6 to 0.85, 0.7 to 0.85),
    50 to mapOf(0.1 to 0.75, 0.15 to 0.75, 0.2 to 0.75, 0.3 to 0.75, 0.4 to 0.75, 0.5 to 0.80, 0.6 to 0.85, 0.7 to 0.85),
    51 to mapOf(0.1 to 0.65, 0.15 to 0.65, 0.2 to 0.65, 0.3 to 0.70, 0.4 to 0.70, 0.5 to 0.75, 0.6 to 0.80, 0.7 to 0.80),
)


fun getActivePowerFactor(utilizationFactor: Double, effectiveQuantity: Int, isLowVoltage: Boolean = false): Double? {
    val activeMap = if (isLowVoltage) activePowerFactorLowVoltageMap else activePowerFactorMap

    val closestQuantity = activeMap.keys.minByOrNull { kotlin.math.abs(it - effectiveQuantity) }

    if (closestQuantity == null) return null

    val row = activeMap[closestQuantity] ?: return null

    val closestFactor = row.keys.minByOrNull { kotlin.math.abs(it - utilizationFactor) }

    return closestFactor?.let { row[it] }
}
