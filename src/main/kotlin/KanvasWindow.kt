import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import brushes.*

class KanvasWindow {

    // Returns a MaterialTheme with
    // all Window's elements to be rendered
    @Composable
    fun renderWindow() {

        // Default hard coded values
        val defaultBrush: Brush = CircleBrush();
        val selectedColor = remember { mutableStateOf(Color.Red) }
        val selectedBrush = remember { mutableStateOf(defaultBrush) }

        // Get the objects we want to display in the window
        val toolbar = KanvasToolbar("Kanvas Brushes", selectedBrush);
        val canvas = KanvasKanvas(selectedColor, selectedBrush);

        MaterialTheme {
            Column() {
                toolbar.render();
                canvas.render();
            }
        }
    }
}