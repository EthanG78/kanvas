// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

// @Preview(showBackground = true)
@Composable
fun CanvasDrawExample() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawRect(Color.Blue, topLeft = Offset(0f, 0f), size = Size(this.size.width, 55f))
        drawCircle(Color.Red, center = Offset(50f, 200f), radius = 40f)
        drawLine(
            Color.Green, Offset(20f, 0f),
            Offset(200f, 200f), strokeWidth = 5f
        )

        drawArc(
            Color.Black,
            0f,
            60f,
            useCenter = true,
            size = Size(300f, 300f),
            topLeft = Offset(60f, 60f)
        )
    }
}

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        /*Button(onClick = {
            text = "Hello, Desktop!"
        }) {
            Text(text)
        }*/

        CanvasDrawExample()
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
