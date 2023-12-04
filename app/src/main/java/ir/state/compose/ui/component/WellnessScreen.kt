package ir.state.compose.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import ir.state.compose.viewmodel.WellnessViewModel

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {

    Column(modifier = modifier) {
        StatefulCounter(modifier = modifier)

        WellnessTasksList(
            onCloseTask = { task -> wellnessViewModel.remove(task) },
            list = wellnessViewModel.tasks,
            modifier = modifier,
        )
    }
}


@Preview
@Composable
fun PreviewWellnessScreen() {
//    WellnessScreen()
}