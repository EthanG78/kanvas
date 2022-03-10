package buttons

import androidx.compose.runtime.Composable

abstract class Button protected constructor() {
    @Composable
    abstract fun render();
    abstract fun handleClick();
}