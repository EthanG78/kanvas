import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.isPrimaryPressed
import androidx.compose.ui.input.pointer.isSecondaryPressed
import androidx.compose.ui.input.pointer.pointerInput

class KanvasKanvas : Renderable {
    // TODO: need a way to edit the selected brush's properties - like a dialog pops up on all of the BrushButtons
    // with their respective propertied when double clicked

    @Composable
    override fun render() {
        return Canvas(modifier = Modifier.fillMaxSize().pointerInput(Unit) {
            awaitPointerEventScope {
                while (true) {
                    val event = awaitPointerEvent();
                    // Left mouse button draws a circle,
                    // and right mouse button erases the canvas
                    if (event.buttons.isPrimaryPressed) {
                        println("CLICKING LEFT BUTTON");
                        //positions = positions + event.changes.first().position;
                    } else if (event.buttons.isSecondaryPressed) {
                        println("CLICKING RIGHT BUTTON");
                        //positions = emptyList();
                    }

                }
            }
        }) {
            drawLine(
                Color.Green, Offset(20f, 0f),
                Offset(200f, 200f), strokeWidth = 5f
            )
        };
    }
}