package brushes

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope

class RectBrush : Brush {
    private var width: Float = 10f;
    private var height: Float = 10f;

    fun setRectWidth(width: Float) {
        this.width = width;
    }

    fun setRectHeight(height: Float) {
        this.height = height;
    }

    override fun DrawScope.draw(color: Color, pos: Offset) {
        // return a drawing rect
        this.drawRect(
            color = color,
            size = Size(width = width, height = height),
            topLeft = pos
        )
    }
}