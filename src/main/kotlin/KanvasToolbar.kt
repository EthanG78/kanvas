import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable

class KanvasToolbar(private val title: String) {

    @Composable
    fun renderToolbar()
    {
        TopAppBar(
            title = {
                    Row {
                        // we can put ANY composable object here
                        // keep this in mind
                        Text(text = title)
                    }
            },
            backgroundColor = MaterialTheme.colors.primarySurface,
            actions = {
                // Put our drawing buttons here
                // RowScope here, so these icons will be placed horizontally
                IconButton(onClick = { /* set the brush */ }) {
                    Icon(Icons.Filled.Favorite, contentDescription = "Localized description")
                }
                IconButton(onClick = { /* set another brush */ }) {
                    Icon(Icons.Filled.AccountBox, contentDescription = "Localized description")
                }
            }
        )
    }
}