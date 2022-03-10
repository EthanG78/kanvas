package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable


class SquareButton : Button() {
    companion object GetInstance {
        private val instance = SquareButton();
        fun getInstance(): SquareButton {
            return instance;
        }
    }

    @Composable
    override fun render() {
        return IconButton(onClick = { println("square button clicked") }) {
            Icon(Icons.Filled.Home, contentDescription = "Localized description")
        }
    }
}
