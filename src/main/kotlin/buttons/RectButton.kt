package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import brushes.Brush
import brushes.RectBrush


class RectButton : BrushButton() {
    private var drawBrush: MutableState<Brush>? = null;

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
        // TODO: Hardcoded, will be configured in future

        val width = 25.0f;
        val height = 50.0f;
        val newBrush: RectBrush = createBrush() as RectBrush;
        newBrush.setRectWidth(width);
        newBrush.setRectHeight(height);

        instance.drawBrush?.value = newBrush;

        println("rect button clicked");
    }

    @Composable
    override fun render() {
        return IconButton(onClick = { this.handleClick() }) {
            Icon(Icons.Filled.Favorite, contentDescription = "Localized description")
        }
    }
}