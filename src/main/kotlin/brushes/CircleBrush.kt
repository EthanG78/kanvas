package brushes

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import marks.CircleMark
import marks.Mark

class CircleBrush : BaseBrush() {
    private var radius: Float = 10.0f;

    // had to change from setRadius, because it apparently clashes with a signature in the JVM..idk
    fun setCircleRadius(radius: Float) {
        this.radius = radius;
    }

    override fun createMark(color: Color, pos: Offset): Mark {
        return CircleMark(color, pos, radius);
    }
}
