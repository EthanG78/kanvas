package marks

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.DrawScope

open class ContinuousMark(startMark: Mark) : Mark {
    protected var marks = ArrayList<Mark>();

    init {
        marks += startMark
    }

    override fun applyStroke(pos: Offset) {
        if ((marks.last().getPosition() - pos).getDistance() > 10) {
            val newMark = marks.last().clone()
            newMark.applyStroke(pos)
            marks.add(newMark)
        }
    }

    override fun DrawScope.draw() {
        marks.slice(1 until marks.size).forEach {
            with(it) {
                draw();
            }
        }
    }

    override fun getPosition(): Offset {
        return marks.first().getPosition()
    }

    override fun clone(): Mark {
        val cloned = ContinuousMark(this.marks.first().clone())
        cloned.marks = this.marks.slice(1 until marks.size).map { it.clone() } as ArrayList<Mark>
        return cloned
    }
}