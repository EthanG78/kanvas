package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import brushes.Brush
import brushes.RectBrush


class SquareButton : BrushButton() {
    companion object GetInstance {
        private val instance = SquareButton();
        fun getInstance(): SquareButton {
            return instance;
        }
    }

    override fun createBrush(): Brush {
        return RectBrush();
    }

    override fun handleClick() {
        println("square button clicked");
    }

    @Composable
    override fun render() {
        return IconButton(onClick = { println("square button clicked") }) {
            Icon(Icons.Filled.Home, contentDescription = "Localized description")
        }
    }
}
