package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import brushes.BaseBrush
import brushes.Brush
import brushes.CircleBrush


class CircleButton : BrushButton() {
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
    }

    @Composable
    override fun render() {
        return IconButton(onClick = { this.handleClick() }) {
            Icon(Icons.Filled.CheckCircle, contentDescription = "Localized description")
        }
    }
}
