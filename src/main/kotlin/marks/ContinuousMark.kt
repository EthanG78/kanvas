package marks

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.DrawScope

class ContinuousMark(startMark: SingleMark) : Mark {
    private var marks = ArrayList<SingleMark>();

    init {
        marks += startMark
    }

    override fun stroke(pos: Offset) {
        println("STROKING CONTINUEOUS")
        if (pos != marks.last().getPosition()) {
            val newMark = marks.last().clone()
            newMark.stroke(pos)
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