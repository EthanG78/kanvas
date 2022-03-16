package brushes

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import marks.Mark

interface Brush {
    fun setColor(color: Color)
    fun setSize(size: Float)
    fun stroke(pos: Offset) : Mark;
    fun finishStroke()
}