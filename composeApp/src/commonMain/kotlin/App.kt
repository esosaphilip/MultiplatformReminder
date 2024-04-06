import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import di.initializeKoin
import org.jetbrains.compose.ui.tooling.preview.Preview
import presentation.screen.home.HomeScreen


@Composable
@Preview
fun App() {
    initializeKoin()
    val colors by mutableStateOf(
        if (isSystemInDarkTheme()) darkColors else lightColors
    )

    MaterialTheme(colorScheme = colors) {
        Navigator(HomeScreen()) {
            SlideTransition(it)
        }
    }
}



