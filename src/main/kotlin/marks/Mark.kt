package marks

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.DrawScope

interface Mark : MarkPrototype {
    fun applyStroke(pos: Offset)
    fun DrawScope.draw();
    fun getPosition(): Offset
}