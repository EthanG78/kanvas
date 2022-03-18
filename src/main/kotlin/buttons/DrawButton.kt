package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import compose.icons.FeatherIcons
import brushes.Brush
import brushes.DrawBrush
import compose.icons.feathericons.Edit


class DrawButton : BrushButton() {
    companion object GetInstance {
        private val instance = DrawButton();
        fun getInstance(drawBrush: MutableState<Brush>): DrawButton {
            instance.drawBrush = drawBrush;
            return instance;
        }
    }

    override fun createBrush(): Brush {
        return DrawBrush();
    }

    override fun handleClick() {
        val newBrush = createBrush() as DrawBrush;
        instance.drawBrush?.value = newBrush;
    }

    @Composable
    override fun render() {
        return IconButton(onClick = { this.handleClick() }) {
            Icon(FeatherIcons.Edit, contentDescription = "Localized description")
        }
    }
}
