package brushes

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope

class DrawBrush : Brush {
    private var width: Int = 1;

    fun setDrawWidth(width: Int) {
        this.width = width;
    }

    override fun DrawScope.draw(color: Color, pos: Offset) {
        // return a drawing mark
        return ;
    }
}
