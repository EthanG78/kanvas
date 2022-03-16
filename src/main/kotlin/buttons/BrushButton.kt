package buttons

import androidx.compose.runtime.MutableState
import brushes.Brush

abstract class BrushButton : Button() {
    protected var drawBrush: MutableState<Brush>? = null;
    abstract fun createBrush(): Brush;
}