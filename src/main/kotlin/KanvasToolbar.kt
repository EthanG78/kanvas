import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import buttons.*

class KanvasToolbar(private val title: String) : Renderable {
    private val drawButton = DrawButton.getInstance();
    private val circleButton = CircleButton.getInstance();
    private val squareButton = SquareButton.getInstance();
    private val rectButton = RectButton.getInstance();

    @Composable
    override fun render() {
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
                drawButton.render()
                circleButton.render()
                squareButton.render()
                rectButton.render()
            }
        )
    }
}