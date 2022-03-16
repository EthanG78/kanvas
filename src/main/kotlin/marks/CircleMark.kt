package marks

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope

class CircleMark(color: Color, pos: Offset, private var radius: Float) : SingleMark(color, pos) {
    override fun DrawScope.draw() {
        this.drawCircle(
            color = color,
            radius = radius,
            center = pos,
        );
    }

    override fun clone() : CircleMark {
        return CircleMark(color, pos, radius)
    }
}
