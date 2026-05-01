package ua.melnyk.application.organise.ui.root

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.compose.AppTheme


@Preview(showBackground = true)
@Composable
fun AppScaffold() {
    AppTheme(){
    val navController = rememberNavController()

    Scaffold(contentWindowInsets = WindowInsets.ime) {
        AppNavHost(
            navController = navController,
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        )
    }
}
}