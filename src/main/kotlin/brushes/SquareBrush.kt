package brushes

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import marks.Mark
import marks.RectMark

class SquareBrush : BaseBrush() {
    override fun createMark(color: Color, pos: Offset): Mark {
        return RectMark(color, pos, brushSize, brushSize)
    }
}
