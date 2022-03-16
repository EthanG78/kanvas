package brushes

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import marks.Mark

interface Brush {
    fun stroke(color: Color, pos: Offset) : Mark;
    fun finishStroke()
}