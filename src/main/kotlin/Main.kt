import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.mouseClickable
import androidx.compose.material.Button
import androidx.compose.material.Colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.input.pointer.*
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

// DO WE NEED THIS ANYMORE???
@Composable
fun DrawKanvas() {
    var positions by remember { mutableStateOf(listOf<Offset>()) }
    val brush = CircleBrush(5f);

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
            //brush.DrawBigCircle(pos);
        }
    }
}

@Composable
@Preview
fun App() {
    MaterialTheme {
        DrawKanvas();
        val brush = CircleBrush(5f);
        brush.DrawBigCircle(Offset(50f, 50f));
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "Kanvas")
    {
        App()
    }
}
