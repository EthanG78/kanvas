import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import brushes.Brush
import brushes.CircleBrush
import brushes.RectBrush
import buttons.*

class KanvasToolbar(private val title: String, private var drawBrush: MutableState<Brush>) : Renderable {
    private val drawButton = DrawButton.getInstance();
    private val circleButton = CircleButton.getInstance(drawBrush);
    private val squareButton = SquareButton.getInstance(drawBrush);
    private val rectButton = RectButton.getInstance(drawBrush);

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
            },
        )
    }
}