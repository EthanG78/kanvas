package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import brushes.BaseBrush
import brushes.Brush
import brushes.CircleBrush
import brushes.DrawBrush


class DrawButton : BrushButton() {
    companion object GetInstance {
        private val instance = DrawButton();
        fun getInstance(drawBrush: MutableState<Brush>): DrawButton {
            DrawButton.instance.drawBrush = drawBrush;
            return instance;
        }
    }

    override fun createBrush(): Brush {
        println("creating draw brush")
        return DrawBrush();
    }

    override fun handleClick() {
        val radius = 25.0f;
        val newBrush = createBrush() as DrawBrush;
        newBrush.setDrawWidth(radius);

        DrawButton.instance.drawBrush?.value = newBrush;

        println("draw button clicked");
    }

    @Composable
    override fun render() {
        return IconButton(onClick = { this.handleClick() }) {
            Icon(Icons.Filled.Lock, contentDescription = "Localized description")
        }
    }
}
