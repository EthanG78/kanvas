package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import brushes.Brush
import brushes.SquareBrush
import compose.icons.FeatherIcons
import compose.icons.feathericons.Square


class SquareButton : BrushButton() {
    companion object GetInstance {
        private val instance = SquareButton();
        fun getInstance(drawBrush: MutableState<Brush>): SquareButton {
            instance.drawBrush = drawBrush;
            return instance;
        }
    }

    override fun createBrush(): Brush {
        return SquareBrush();
    }

    override fun handleClick() {
        instance.drawBrush?.value = createBrush()
    }

    @Composable
    override fun render() {
        return IconButton(onClick = { this.handleClick() }) {
            Icon(FeatherIcons.Square, contentDescription = "Localized description")
        }
    }
}
