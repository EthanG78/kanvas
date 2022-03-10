package buttons

import androidx.compose.runtime.Composable
import brushes.Brush

abstract class Button protected constructor() {
    @Composable
    abstract fun render();
    abstract fun createBrush(): Brush;
}