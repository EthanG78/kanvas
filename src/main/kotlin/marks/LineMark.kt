package marks

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope

open class LineMark(color: Color, protected var start: Offset, end: Offset, protected var width: Float) :
    SingleMark(color, end) {

    override fun DrawScope.draw() {
        drawLine(color, start, pos, width, cap= StrokeCap.Round)
    }

    override fun clone(): LineMark {
        return LineMark(color, start, pos, width)
    }
}
