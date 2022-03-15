import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.*
import brushes.*

class KanvasWindow {

    // Returns a MaterialTheme with
    // all Window's elements to be rendered
    @Composable
    fun renderWindow() {
        // Get the objects we want to display in the window
        val toolbar = KanvasToolbar("Kanvas Brushes");
        val canvas = KanvasKanvas();

        val drawColor by remember { mutableStateOf(Color.Red) }
        val drawBrush by remember { mutableStateOf(CircleBrush()) }

        MaterialTheme {
            Column() {
                toolbar.render()
                canvas.render(drawColor, drawBrush);
            }
        }
    }
}