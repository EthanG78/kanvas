package brushes

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope

class CircleBrush : Brush {
    var radius: Float = 10.0f;

    // had to change from setRadius, because it apparently clashes with a signature in the JVM..idk
    fun setCircleRadius(radius: Float) {
        this.radius = radius;
    }

    override fun DrawScope.draw(color: Color, pos: Offset) {
        // return a circle mark
        this.drawCircle(
            color = color,
            radius = radius,
            center = pos,
        );
    }
}
