package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable


class SquareButton : Button() {
    private val instance = SquareButton();
    override fun getInstance(): Button {
        return this.instance;
    }

    @Composable
    override fun composable() {
        return IconButton(onClick = { println("square button clicked") }) {
            Icon(Icons.Filled.Home, contentDescription = "Localized description")
        }
    }
}
