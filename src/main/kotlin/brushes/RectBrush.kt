package brushes

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import marks.Mark
import marks.RectMark

class RectBrush : BaseBrush() {
    private var width: Float = 10f;
    private var height: Float = 10f;
    private var currentMark: Mark? = null

    fun setRectWidth(width: Float) {
        this.width = width;
    }

    fun setRectHeight(height: Float) {
        this.height = height;
    }

    override fun createMark(color: Color, pos: Offset): Mark {
        return RectMark(color, pos, width, height)
    }
}