package brushes

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import marks.Mark

abstract class BaseBrush : Brush {
    private var currentMark: Mark? = null;
    private var color = Color.Red
    protected var brushSize = 10.0F

    protected abstract fun createMark(color: Color, pos: Offset) : Mark;

    override fun setColor(color: Color) {
        this.color = color
    }

    override fun setSize(size: Float) {
        this.brushSize = size
    }

    override fun stroke(pos: Offset) : Mark {
        if (currentMark == null) {
            currentMark = this.createMark(color, pos)
        } else {
            (currentMark as Mark).applyStroke(pos);
        }
        return (currentMark as Mark);
    }

    override fun finishStroke() {
        currentMark = null
    }
}