package brushes

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import marks.LineMark
import marks.Mark

class LineBrush : BaseBrush() {
    override fun createMark(color: Color, pos: Offset): Mark {
        return LineMark(color, pos, brushSize);
    }
}
