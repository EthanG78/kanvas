package brushes

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import marks.CircleMark
import marks.ContinuousMark
import marks.Mark

class DrawBrush : BaseBrush() {
    private var width: Float = 1.0F

    fun setDrawWidth(width: Float) {
        this.width = width;
    }

    override fun createMark(color: Color, pos: Offset): Mark {
        println("CREATING CONINUEOUS")
        return ContinuousMark(CircleMark(color, pos, width))
    }
}
