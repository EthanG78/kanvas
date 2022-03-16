package brushes

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import marks.CircleMark
import marks.Mark

class CircleBrush : BaseBrush() {
    override fun createMark(color: Color, pos: Offset): Mark {
        return CircleMark(color, pos, brushSize);
    }
}
