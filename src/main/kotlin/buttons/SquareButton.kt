package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import brushes.BaseBrush
import brushes.Brush
import brushes.RectBrush


class SquareButton : BrushButton() {
    companion object GetInstance {
        private val instance = SquareButton();
        fun getInstance(drawBrush: MutableState<Brush>): SquareButton {
            instance.drawBrush = drawBrush;
            return instance;
        }
    }

    override fun createBrush(): Brush {
        return RectBrush();
    }

    override fun handleClick() {
        val newBrush: RectBrush = createBrush() as RectBrush;
        instance.drawBrush?.value = newBrush;
    }

    @Composable
    override fun render() {
        return IconButton(onClick = { this.handleClick() }) {
            Icon(Icons.Filled.Home, contentDescription = "Localized description")
        }
    }
}
