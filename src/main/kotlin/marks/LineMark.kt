package marks

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope

class LineMark(color: Color, private var start: Offset, end: Offset, private var width: Float) :
    SingleMark(color, end) {

    constructor(color: Color, end: Offset, width: Float) : this(color, Offset.Unspecified, end, width) {
    }

    override fun applyStroke(pos: Offset) {
        println("stroking line")
        if (pos != this.pos) {
            this.start = this.pos;
            this.pos = pos;
        }
    }

    override fun DrawScope.draw() {
        println("drawing line")
        this.drawLine(color, start, pos, width)
    }

    override fun clone(): LineMark {
        return LineMark(color, start, pos, width)
    }
}
