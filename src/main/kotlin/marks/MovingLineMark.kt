package marks

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope

class MovingLineMark(color: Color, start: Offset, end: Offset, width: Float) :
    LineMark(color, start, end, width) {

    constructor(color: Color, end: Offset, width: Float) : this(color, Offset.Unspecified, end, width) {
    }

    override fun applyStroke(pos: Offset) {
        if (pos != this.pos) {
            this.start = this.pos;
            this.pos = pos;
        }
    }

    override fun DrawScope.draw() {
        drawLine(color, start, pos, width, cap= StrokeCap.Round)
    }

    override fun clone(): MovingLineMark {
        return MovingLineMark(color, start, pos, width)
    }
}
