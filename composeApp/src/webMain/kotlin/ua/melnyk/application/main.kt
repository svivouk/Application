package ua.melnyk.application

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import ua.melnyk.application.organise.ui.root.AppScaffold

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport {
        AppScaffold()
    }
}