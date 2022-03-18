package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import brushes.Brush
import brushes.LineBrush
import compose.icons.FeatherIcons
import compose.icons.feathericons.Maximize2


class LineButton : BrushButton() {
    companion object GetInstance {
        private val instance = LineButton();
        fun getInstance(drawBrush: MutableState<Brush>): LineButton {
            instance.drawBrush = drawBrush;
            return instance;
        }
    }

    override fun createBrush(): Brush {
        return LineBrush();
    }

    override fun handleClick() {
        instance.drawBrush?.value = createBrush()
    }

    @Composable
    override fun render() {
        return IconButton(onClick = { this.handleClick() }) {
            Icon(FeatherIcons.Maximize2, contentDescription = "Localized description")
        }
    }
}
