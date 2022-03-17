package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import brushes.Brush
import brushes.TriangleBrush


class TriangleButton : BrushButton() {
    companion object GetInstance {
        private val instance = TriangleButton();
        fun getInstance(drawBrush: MutableState<Brush>): TriangleButton {
            instance.drawBrush = drawBrush;
            return instance;
        }
    }

    override fun createBrush(): Brush {
        return TriangleBrush();
    }

    override fun handleClick() {
        val newBrush: TriangleBrush = createBrush() as TriangleBrush
        instance.drawBrush?.value = newBrush;
    }

    @Composable
    override fun render() {
        return IconButton(onClick = { this.handleClick() }) {
            Icon(Icons.Filled.KeyboardArrowUp, contentDescription = "Localized description")
        }
    }
}
