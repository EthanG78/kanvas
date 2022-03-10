package brushes

class RectBrush : Brush {
    private var width: Int = 1;
    private var height: Int = 1;

    fun setWidth(width: Int) {
        this.width = width;
    }

    fun setHeight(height: Int) {
        this.height = height;
    }

    override fun draw(): Mark {
        // return a rect mark
        return Mark();
    }
}