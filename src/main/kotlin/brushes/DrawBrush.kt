package brushes

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import marks.*

class DrawBrush : BaseBrush() {
    override fun createMark(color: Color, pos: Offset): Mark {
        return ContinuousMark(MovingLineMark(color, pos, brushSize))
    }
}
