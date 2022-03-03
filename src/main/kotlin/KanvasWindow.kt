import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

class KanvasWindow {

    // Returns a MaterialTheme with
    // all Window's elements to be rendered
    @Composable
    fun renderWindow()
    {
        // Get the objects we want to display in the window
        val toolbar = KanvasToolbar("Kanvas Brushes");

        MaterialTheme {
            Column() {
                toolbar.renderToolbar()
            }
        }
    }
}