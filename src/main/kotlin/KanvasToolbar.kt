import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusTarget
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import brushes.Brush
import buttons.*

private class DropDown<T>(
    private var title: String,
    private var items: List<Pair<T, String>>,
    private var onClick: (T) -> Any?
) :
    Renderable {

    @Composable
    override fun render() {
        var expanded by remember { mutableStateOf(false) }
        OutlinedButton(
            onClick = { expanded = true }) {
            Text(title)
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.focusTarget().background(
                Color.White
            )
        ) {
            items.forEach {
                DropdownMenuItem(onClick = {
                    onClick(it.first)
                    expanded = false
                }) {
                    Row {
                        Text(
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center
                            ),
                            text = it.second
                        )
                    }
                }
            }
        }

    }
}


class KanvasToolbar(private val title: String, private var drawBrush: MutableState<Brush>) : Renderable {
    private val drawButton = DrawButton.getInstance(drawBrush);
    private val circleButton = CircleButton.getInstance(drawBrush);
    private val squareButton = SquareButton.getInstance(drawBrush);
    private val rectButton = RectButton.getInstance(drawBrush);
    private val colors =
        listOf(
            Pair(Color.Red, "Red"),
            Pair(Color.Black, "Black"),
            Pair(Color.Blue, "Blue"),
            Pair(Color.Cyan, "Cyan"),
            Pair(Color.Green, "Green"),
            Pair(Color.Magenta, "Magenta"),
            Pair(Color.Yellow, "Yellow")
        ).map { Pair(it.first, "${it.second}  0x${it.first.value.toString(16)}") }
    private val brushSizes = listOf(2.0F, 5.0F, 10.0F, 25.0F).map { Pair(it, "$it Pt.") }
    private val colorDrop = DropDown("Brush Color", colors) { color -> drawBrush.value.setColor(color) }
    private val sizeDrop = DropDown("Brush Size", brushSizes) { size -> drawBrush.value.setSize(size) }

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
                // RowScope here, so these icons will be placed horizontally
                sizeDrop.render()
                Spacer(modifier = Modifier.width(10.dp))
                colorDrop.render()
                Spacer(modifier = Modifier.width(10.dp))
                drawButton.render()
                circleButton.render()
                squareButton.render()
                rectButton.render()
            },
        )
    }
}