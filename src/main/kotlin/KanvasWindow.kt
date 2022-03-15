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
        val drawColor = remember { mutableStateOf(Color.Red) }
        val drawBrush = remember { mutableStateOf(defaultBrush) }

        // Get the objects we want to display in the window
        val toolbar = KanvasToolbar("Kanvas Brushes", drawBrush);
        val canvas = KanvasKanvas(drawColor, drawBrush);

        MaterialTheme {
            Column() {
                toolbar.render();
                canvas.render();
            }
        }
    }
}