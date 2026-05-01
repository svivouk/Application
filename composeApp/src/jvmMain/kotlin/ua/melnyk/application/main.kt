package ua.melnyk.application

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ua.melnyk.application.organise.ui.root.AppScaffold

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Organise",
    ) {
        AppScaffold()
    }
}