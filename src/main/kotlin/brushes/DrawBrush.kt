package brushes

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import marks.*

class DrawBrush : BaseBrush() {
    private var width: Float = 3.0F

    fun setDrawWidth(width: Float) {
        this.width = width;
    }

    override fun createMark(color: Color, pos: Offset): Mark {
        //return ContinuousMark(LineMark(color, width))
        return JoiningMark(LineMark(color, pos, width))
    }
}
