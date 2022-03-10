package brushes

import androidx.compose.ui.graphics.Color

class DrawBrush : Brush {
    private var width: Int = 1;
    private var color: Color = Color.Black;

    fun setWidth(width: Int) {
        this.width = width;
    }

    fun setColor(color: Color) {
        this.color = color;
    }

    override fun draw(): Mark {
        // return a drawing mark
        return Mark();
    }
}
