import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.DrawScope

class CircleBrush(val radius: Float){
    fun DrawScope.DrawBigCircle(pos: Offset): Unit {
        drawCircle(
            color = Color.Red,
            radius = radius,
            center = pos,
        );
    }
}