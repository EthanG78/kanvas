package brushes

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import marks.Mark

abstract class BaseBrush : Brush {
    private var currentMark: Mark? = null;

    protected abstract fun createMark(color: Color, pos: Offset) : Mark;

    override fun stroke(color: Color, pos: Offset) : Mark {
        if (currentMark == null) {
            currentMark = this.createMark(color, pos)
        } else {
            (currentMark as Mark).stroke(pos);
        }
        return (currentMark as Mark);
    }

    override fun finishStroke() {
        currentMark = null
    }
}