import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.input.pointer.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset

// THIS IS A TEMPORARY CLASS
// TODO: MAKE SINGLETON

class Kanvas private constructor()
{
    // Instance will not be created until
    // the companion object is called
    companion object
    {
        val instance = Kanvas();
    }

    /*@Composable
    fun renderKanvas() {
        var positions by remember { mutableStateOf(listOf<Offset>()) }

        Canvas(modifier = Modifier
            .fillMaxSize()
            .pointerInput(Unit) {
                awaitPointerEventScope {
                    while (true)
                    {
                        val event = awaitPointerEvent();
                        // Left mouse button draws a circle,
                        // and right mouse button erases the canvas
                        if (event.buttons.isPrimaryPressed) {
                            positions = positions  + event.changes.first().position;
                        } else if (event.buttons.isSecondaryPressed) {
                            positions = emptyList();
                        }
                    }
                }
            }) {
            for (pos in positions)
            {
                // We will eventually use brushes to draw things
            }
        }
    }*/
}