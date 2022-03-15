package brushes

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope

interface Brush {
    fun DrawScope.draw(color: Color, pos: Offset);
}