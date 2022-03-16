package marks

import androidx.compose.ui.graphics.drawscope.DrawScope

class JoiningMark(startMark: SingleMark) : ContinuousMark(startMark) {
    override fun DrawScope.draw() {
        marks.slice(1 until marks.size).forEach {
            with(it) {
                draw();
            }
        }
    }
}
