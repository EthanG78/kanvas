import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import brushes.*
import compose.icons.SimpleIcons
import compose.icons.simpleicons.Kotlin

class KanvasWindow {

    // Returns a MaterialTheme with
    // all Window's elements to be rendered
    @Composable
    fun renderWindow() {

        // Default hard coded values
        val defaultBrush: Brush = CircleBrush();
        val selectedBrush = remember { mutableStateOf(defaultBrush) }

        // Get the objects we want to display in the window
        // Using the Kotlin logo as the 'K' in the title
        val icon = SimpleIcons.Kotlin
        val toolbar = KanvasToolbar(icon, "anvas Brushes", selectedBrush);
        val canvas = KanvasKanvas(selectedBrush);

        MaterialTheme {
            Column() {
                toolbar.render();
                canvas.render();
            }
        }
    }
}