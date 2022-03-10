package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable


class RectButton : Button() {
    private val instance = RectButton();
    override fun getInstance(): Button {
        return this.instance;
    }

    @Composable
    override fun composable() {
        return IconButton(onClick = { println("rect button clicked") }) {
            Icon(Icons.Filled.Favorite, contentDescription = "Localized description")
        }
    }
}