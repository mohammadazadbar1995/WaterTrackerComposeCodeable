package ir.state.compose.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ir.state.compose.model.WellnessTask

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {

    Column(modifier = modifier) {
        StatefulCounter(modifier = modifier)

        val list = remember {
            getWellnessTasks().toMutableStateList()
        }
        WellnessTasksList(
            onCloseTask = { task -> list.remove(task) },
            list = list,
            modifier = modifier,
        )
    }
}

private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }


@Preview
@Composable
fun PreviewWellnessScreen() {
    WellnessScreen()
}