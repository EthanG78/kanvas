package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import brushes.Brush
import brushes.DrawBrush


class DrawButton : BrushButton() {
    companion object GetInstance {
        private val instance = DrawButton();
        fun getInstance(): DrawButton {
            return instance;
        }
    }

    override fun createBrush(): Brush {
        return DrawBrush();
    }

    override fun handleClick() {
        println("draw button clicked");
    }

    @Composable
    override fun render() {
        return IconButton(onClick = { this.handleClick() }) {
            Icon(Icons.Filled.Lock, contentDescription = "Localized description")
        }
    }
}
