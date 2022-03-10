package buttons

import brushes.Brush

abstract class BrushButton : Button() {
    abstract fun createBrush(): Brush;
}