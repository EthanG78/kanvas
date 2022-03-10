package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable


class DrawButton : Button() {
    companion object GetInstance {
        private val instance = DrawButton();
        fun getInstance(): DrawButton {
            return instance;
        }
    }

    @Composable
    override fun render() {
        return IconButton(onClick = { println("draw button clicked") }) {
            Icon(Icons.Filled.Lock, contentDescription = "Localized description")
        }
    }
}
