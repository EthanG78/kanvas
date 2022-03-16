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
        // TODO: Hardcoded, will be configured in future

        val width = 25.0f;
        val newBrush: RectBrush = createBrush() as RectBrush;
        newBrush.setRectWidth(width);
        newBrush.setRectHeight(width);

        instance.drawBrush?.value = newBrush;

        println("square button clicked");
    }

    @Composable
    override fun render() {
        return IconButton(onClick = { this.handleClick() }) {
            Icon(Icons.Filled.Home, contentDescription = "Localized description")
        }
    }
}
