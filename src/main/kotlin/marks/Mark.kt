package marks

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.DrawScope

interface Mark {
    fun stroke(pos: Offset)
    fun DrawScope.draw();
}