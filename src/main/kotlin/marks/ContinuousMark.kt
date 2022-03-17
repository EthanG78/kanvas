package marks

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.DrawScope

open class ContinuousMark(startMark: SingleMark) : Mark {
    protected var marks = ArrayList<SingleMark>();

    init {
        marks += startMark
    }

    override fun applyStroke(pos: Offset) {
        if ((marks.last().getPosition() - pos).getDistance() > 10) {
            val newMark = marks.last().clone()
            newMark.applyStroke(pos)
            marks.add(newMark as SingleMark)
        }
    }

    override fun DrawScope.draw() {
        marks.slice(1 until marks.size).forEach {
            with(it) {
                draw();
            }
        }
    }

}