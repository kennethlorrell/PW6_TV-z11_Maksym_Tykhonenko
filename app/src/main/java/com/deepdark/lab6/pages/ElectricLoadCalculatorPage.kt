package com.deepdark.lab6.pages

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.deepdark.lab6.data.ElectricLoadRepository

@Composable
fun ElectricLoadCalculatorPage() {
    val workshop = ElectricLoadRepository.workshop

    val scrollState = rememberScrollState()

    var resultText by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .verticalScroll(scrollState)
    ) {
        Button(
            onClick = {
                workshop.calculateUnknowns()

                resultText = """
                    1. Для заданого складу ЕП та їх характеристик цехової мережі силове навантаження становитиме:
                    1.1 Груповий коефіцієнт використання для ШР1=ШР2=ШР3: ${workshop.distributionBuses.firstOrNull()?.utilizationFactor ?: 0.0};
                    1.2 Ефективна кількість ЕП для ШР1=ШР2=ШР3: ${(workshop.distributionBuses.firstOrNull()?.effectiveQuantity ?: 0.0).toInt()};
                    1.3 Розрахунковий коефіцієнт активної потужності для ШР1=ШР2=ШР3: ${workshop.distributionBuses.firstOrNull()?.activePowerFactor ?: 0.0};
                    1.4 Розрахункове активне навантаження для ШР1=ШР2=ШР3: ${"%.2f".format(workshop.distributionBuses.firstOrNull()?.activeLoad ?: 0.0)} кВт;
                    1.5 Розрахункове реактивне навантаження для ШР1=ШР2=ШР3: ${"%.2f".format(workshop.distributionBuses.firstOrNull()?.reactiveLoad ?: 0.0)} квар;
                    1.6 Повна потужність для ШР1=ШР2=ШР3: ${"%.2f".format(workshop.distributionBuses.firstOrNull()?.totalPower ?: 0.0)} кВА;
                    1.7 Розрахунковий груповий струм для ШР1=ШР2=ШР3: ${"%.2f".format(workshop.distributionBuses.firstOrNull()?.calculatedCurrent ?: 0.0)} A;
                    1.8 Коефіцієнти використання цеху в цілому: ${"%.2f".format(workshop.utilizationFactor ?: 0.0)};
                    1.9 Ефективна кількість ЕП цеху в цілому: ${(workshop.effectiveQuantity ?: 0.0).toInt()};
                    1.10 Розрахунковий коефіцієнт активної потужності цеху в цілому: ${"%.2f".format(workshop.activePowerFactor ?: 0.0)};
                    1.11 Розрахункове активне навантаження на шинах 0,38 кВ ТП: ${"%.2f".format(workshop.activeLoad ?: 0.0)} кВт;
                    1.12 Розрахункове реактивне навантаження на шинах 0,38 кВ ТП: ${"%.2f".format(workshop.reactiveLoad ?: 0.0)} квар;
                    1.13 Повна потужність на шинах 0,38 кВ ТП: ${"%.2f".format(workshop.totalPower ?: 0.0)} кВА;
                    1.14 Розрахунковий груповий струм на шинах 0,38 кВ ТП: ${"%.2f".format(workshop.calculatedCurrent ?: 0.0)} A.
                """.trimIndent()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Розрахувати")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(resultText)
    }
}
