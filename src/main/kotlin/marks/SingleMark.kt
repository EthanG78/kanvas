package marks

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color

abstract class SingleMark(protected var color: Color, protected var pos: Offset) : Mark, MarkPrototype {
    override fun applyStroke(pos: Offset) {
        if (pos != this.pos) {
            this.pos = pos;
        }
    }

    fun getPosition(): Offset {
        return this.pos;
    }
}