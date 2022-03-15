package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import brushes.Brush
import brushes.CircleBrush
import brushes.RectBrush


class CircleButton : BrushButton() {
    private var drawBrush: MutableState<Brush>? = null;

    companion object GetInstance {
        private val instance = CircleButton();
        fun getInstance(drawBrush: MutableState<Brush>): CircleButton {
            instance.drawBrush = drawBrush;
            return instance;
        }
    }

    override fun createBrush(): Brush {
        return CircleBrush();
    }

    override fun handleClick() {
        // TODO: Hardcoded, will be configured in future

        val radius = 25.0f;
        val newBrush: CircleBrush = createBrush() as CircleBrush;
        newBrush.setCircleRadius(radius);

        instance.drawBrush?.value = newBrush;

        println("circle button clicked");
    }

    @Composable
    override fun render() {
        return IconButton(onClick = { this.handleClick() }) {
            Icon(Icons.Filled.CheckCircle, contentDescription = "Localized description")
        }
    }
}
