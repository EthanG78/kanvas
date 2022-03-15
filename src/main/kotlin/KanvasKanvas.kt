import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.isPrimaryPressed
import androidx.compose.ui.input.pointer.isSecondaryPressed
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.runtime.*
import brushes.Brush

class KanvasKanvas {
    // TODO: need a way to edit the selected brush's properties - like a dialog pops up on all of the BrushButtons
    // with their respective propertied when double clicked

    @Composable
    fun render(
        drawColor: Color,
        drawBrush: Brush
    ) {
        var positions by remember { mutableStateOf(listOf<Offset>()) }

        return Canvas(modifier = Modifier.fillMaxSize().pointerInput(Unit) {
            awaitPointerEventScope {
                while (true) {
                    val event = awaitPointerEvent();
                    if (event.buttons.isPrimaryPressed) {
                        println("CLICKING LEFT BUTTON");
                        positions = positions + event.changes.first().position;
                    } else if (event.buttons.isSecondaryPressed) {
                        println("CLICKING RIGHT BUTTON");
                        //positions = emptyList();
                    }

                }
            }
        }) {
            positions.forEach {
                //drawBrush.draw(drawColor, it);
                with( drawBrush ) {
                    draw(drawColor, it);
                }
            }
        };
    }
}