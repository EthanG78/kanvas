package brushes

class CircleBrush : Brush {
    var radius: Int = 1;

    // had to change from setRadius, because it apparently clashes with a signature in the JVM..idk
    fun setCircleRadius(radius: Int) {
        this.radius = radius;
    }

    override fun draw(): Mark {
        // return a circle mark
        return Mark();
    }
}
