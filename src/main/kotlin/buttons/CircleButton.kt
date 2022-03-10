package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.runtime.Composable
import brushes.Brush
import brushes.CircleBrush


class CircleButton : BrushButton() {
    companion object GetInstance {
        private val instance = CircleButton();
        fun getInstance(): CircleButton {
            return instance;
        }
    }

    override fun createBrush(): Brush {
        return CircleBrush();
    }


    override fun handleClick() {
        println("circle button clicked");
    }

    @Composable
    override fun render() {
        return IconButton(onClick = { this.handleClick() }) {
            Icon(Icons.Filled.CheckCircle, contentDescription = "Localized description")
        }
    }
}
