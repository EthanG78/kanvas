package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable


class RectButton : Button() {
    companion object GetInstance {
        private val instance = RectButton();
        fun getInstance(): RectButton {
            return instance;
        }
    }

    @Composable
    override fun render() {
        return IconButton(onClick = { println("rect button clicked") }) {
            Icon(Icons.Filled.Favorite, contentDescription = "Localized description")
        }
    }
}