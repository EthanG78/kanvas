package marks

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope

class RectMark(color: Color, pos: Offset, private var width: Float, private var height: Float) :
    SingleMark(color, pos) {
    override fun DrawScope.draw() {
        this.drawRect(
            color = color,
            size = Size(width = width, height = height),
            topLeft = pos
        )
    }

    override fun clone() : RectMark {
        return RectMark(color, pos, width, height)
    }
}