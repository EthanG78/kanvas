import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    val window = KanvasWindow()
    Window(onCloseRequest = ::exitApplication, title = "Kanvas - Drawing Application") {
        window.renderWindow()
    }
}
