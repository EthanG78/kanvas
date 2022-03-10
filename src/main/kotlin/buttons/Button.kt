package buttons

import androidx.compose.runtime.Composable

abstract class Button protected constructor() {
    abstract fun getInstance(): Button;

    @Composable
    abstract fun composable();
}