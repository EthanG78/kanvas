package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import brushes.Brush
import brushes.RectBrush


class RectButton : BrushButton() {
    companion object GetInstance {
        private val instance = RectButton();
        fun getInstance(): RectButton {
            return instance;
        }
    }

    override fun createBrush(): Brush {
        return RectBrush();
    }

    override fun handleClick() {
        println("rect button clicked");
    }

    @Composable
    override fun render() {
        return IconButton(onClick = { this.handleClick() }) {
            Icon(Icons.Filled.Favorite, contentDescription = "Localized description")
        }
    }
}