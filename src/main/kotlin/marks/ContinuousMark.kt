package marks

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.DrawScope

open class ContinuousMark(startMark: SingleMark) : Mark {
    protected var marks = ArrayList<SingleMark>();

    init {
        marks += startMark
    }

    override fun applyStroke(pos: Offset) {
        if ((marks.last().getPosition() - pos).getDistance() > 0) {
            val newMark = marks.last().clone()
            newMark.applyStroke(pos)
            marks.add(newMark)
        }
    }

    override fun DrawScope.draw() {
        marks.forEach {
            with(it) {
                draw();
            }
        }
    }

}