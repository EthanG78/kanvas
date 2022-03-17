package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
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
        instance.drawBrush?.value = createBrush()
    }

    @Composable
    override fun render() {
        return IconButton(onClick = { this.handleClick() }) {
            Icon(Icons.Filled.AddCircle, contentDescription = "Localized description")
        }
    }
}
