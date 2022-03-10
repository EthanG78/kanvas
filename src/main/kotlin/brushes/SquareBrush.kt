package brushes

class SquareBrush : Brush {
    private var size: Int = 1;

    fun setSize(size: Int) {
        this.size = size;
    }

    override fun draw(): Mark {
        // return a square mark
        return Mark();
    }
}
