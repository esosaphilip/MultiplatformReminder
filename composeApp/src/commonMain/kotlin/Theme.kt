import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color


val lightRedColor = Color(color = 0xFFF57D88)
val darkRedColor = Color(color = 0xFF77000B)

val lightColors = lightColorScheme(
    primary = lightRedColor,
    onPrimary = darkRedColor,
    primaryContainer = lightRedColor,
    onPrimaryContainer = darkRedColor
)
val darkColors = darkColorScheme(
    primary = lightRedColor,
    onPrimary = darkRedColor,
    primaryContainer = lightRedColor,
    onPrimaryContainer = darkRedColor
)

