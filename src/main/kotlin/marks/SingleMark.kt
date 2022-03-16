package marks

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color

abstract class SingleMark(protected var color: Color, protected var pos: Offset) : Mark {
    override fun stroke(pos: Offset) {
        println("stroking single")
        if (pos != this.pos) {
            this.pos = pos;
        }
    }

    fun getPosition(): Offset {
        return this.pos;
    }

    abstract fun clone() : SingleMark
}