package buttons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.runtime.Composable


class CircleButton : Button() {
    private val instance = CircleButton();
    override fun getInstance(): Button {
        return this.instance;
    }

    @Composable
    override fun composable() {
        return IconButton(onClick = { println("circle button clicked") }) {
            Icon(Icons.Filled.CheckCircle, contentDescription = "Localized description")
        }
    }
}
