package brushes

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import marks.Mark
import marks.RectMark

class RectBrush : BaseBrush() {
    private var width: Float = 10f;

    fun setRectWidth(width: Float) {
        this.width = width;
    }

    override fun createMark(color: Color, pos: Offset): Mark {
        return RectMark(color, pos, width, brushSize)
    }
}