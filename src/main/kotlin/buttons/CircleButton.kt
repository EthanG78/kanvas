package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.runtime.Composable
import brushes.Brush
import brushes.CircleBrush


class CircleButton : Button() {
    companion object GetInstance {
        private val instance = CircleButton();
        fun getInstance(): CircleButton {
            return instance;
        }
    }

    override fun createBrush(): Brush {
        return CircleBrush();
    }

    @Composable
    override fun render() {
        return IconButton(onClick = { println("circle button clicked") }) {
            Icon(Icons.Filled.CheckCircle, contentDescription = "Localized description")
        }
    }
}
