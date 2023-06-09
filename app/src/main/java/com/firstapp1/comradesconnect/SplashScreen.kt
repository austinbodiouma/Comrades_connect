package com.firstapp1.comrades_connect

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun Splashscreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.
        fillMaxSize()


    ) {
        Text(
            text = "Comrades",
            style = TextStyle(
                fontSize = 40.sp,
                fontWeight = FontWeight(700),
                lineHeight = 40.sp,
                letterSpacing = 0.25.sp,
                textAlign = TextAlign.Center,
                color =Color(0xFF0C0CD6)
            )

        )
        Text(
            text = "Connect",

            style = TextStyle(
                fontSize = 40.sp,
                fontWeight = FontWeight(700),
                lineHeight = 40.sp,
                letterSpacing = 0.25.sp,
                textAlign = TextAlign.Center,
                color = Color(0xFF0C0CD6),
            )
        )


    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Splashscreen()
}