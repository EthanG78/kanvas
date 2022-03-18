import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.isPrimaryPressed
import androidx.compose.ui.input.pointer.isSecondaryPressed
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.runtime.*
import brushes.Brush
import marks.Mark

class KanvasKanvas(private var selectedBrush: MutableState<Brush>) :
    Renderable {
    @Composable
    override fun render() {
        var marks by remember { mutableStateOf(listOf<Mark>()) }

        return Canvas(modifier = Modifier.fillMaxSize().pointerInput(Unit) {
            awaitPointerEventScope {
                var drawing = false
                while (true) {
                    val event = awaitPointerEvent();
                    if (event.buttons.isPrimaryPressed) {
                        drawing = true
                        marks = marks + selectedBrush.value.stroke(event.changes.first().position)
                    } else if (event.buttons.isSecondaryPressed) {
                        marks = emptyList();
                    } else if (drawing) {
                        selectedBrush.value.finishStroke()
                        drawing = false
                    }

                }
            }
        }) {
            marks.forEach {
                with(it) {
                    draw();
                }
            }
        };
    }
}