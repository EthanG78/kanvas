package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable


class DrawButton : Button() {
    private val instance = DrawButton();
    override fun getInstance(): Button {
        return this.instance;
    }

    @Composable
    override fun composable() {
        return IconButton(onClick = { println("draw button clicked") }) {
            Icon(Icons.Filled.Lock, contentDescription = "Localized description")
        }
    }
}
