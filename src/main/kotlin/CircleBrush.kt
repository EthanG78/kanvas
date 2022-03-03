import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color

class CircleBrush(private val radius: Float){

    // Draws a circle using
    // the .drawBehind
    // modifier
    @Composable
    fun DrawBigCircle(pos: Offset)
    {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .drawBehind {
                    drawCircle(
                        color = Color.Red,
                        radius = radius,
                        center = pos,
                    );
                }
        )
    }
}