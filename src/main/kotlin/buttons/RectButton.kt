package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import brushes.BaseBrush
import brushes.Brush
import brushes.RectBrush


class RectButton : BrushButton() {
    companion object GetInstance {
        private val instance = RectButton();
        fun getInstance(drawBrush: MutableState<Brush>): RectButton {
            instance.drawBrush = drawBrush;
            return instance;
        }
    }

    override fun createBrush(): Brush {
        return RectBrush();
    }

    override fun handleClick() {
        instance.drawBrush?.value = createBrush()
    }

    @Composable
    override fun render() {
        return IconButton(onClick = { this.handleClick() }) {
            Icon(Icons.Filled.Favorite, contentDescription = "Localized description")
        }
    }
}