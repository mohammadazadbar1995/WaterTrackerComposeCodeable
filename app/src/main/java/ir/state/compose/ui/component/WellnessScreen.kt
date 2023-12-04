package ir.state.compose.ui.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    StatefulCounter(modifier = modifier)
}

@Preview
@Composable
fun PreviewWellnessScreen() {
    WellnessScreen()
}