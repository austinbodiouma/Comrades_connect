package com.firstapp1.comrades_connect

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GetStarted() {
    val buttonColor = Color(0xFF0C0CD6)
    val textColor = Color.White
    val customShape = RoundedCornerShape(
        topStart = 20.dp,
        topEnd = 20.dp,
        bottomEnd = 0.dp,
        bottomStart = 0.dp
    )
    Column(
        Modifier
            .fillMaxSize(),
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize()
                .align(Alignment.CenterHorizontally)
                .padding(top = 50.dp)
                .height(50.dp),
        ) {
            Text(
                text = "Comrades",
                softWrap = true,
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
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        ) {
            Text(
                text = "Connect",
                softWrap = true,
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
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(MaterialTheme.shapes.medium)
                .border(
                    width = 1.dp,
                    color = Color(0xFF0C0CD6),
                    shape = customShape
                )
                .height(800.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Row(
                modifier = Modifier
                    .width(300.dp),
//                horizontalArrangement = Arrangement.Start,
            ) {


            }
            Spacer(
                modifier = Modifier.padding(bottom = 10.dp)
            )

            Spacer(modifier = Modifier.padding(bottom = 16.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(1.dp)
                    .height(64.dp)
                    .width(278.dp),
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = buttonColor
                )

            ) {
                Text(
                    text = "LOGIN",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight(700),
                        lineHeight = 20.sp,
                        letterSpacing = 0.25.sp,
                        textAlign = TextAlign.Center,
                        color = textColor
                    )
                )
            }
            Spacer(modifier = Modifier.padding(bottom = 24.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(1.dp)
                    .height(64.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0xFF0C0CD6),
                        shape = RoundedCornerShape(20.dp)
                    )
                    .width(278.dp),
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White
                )
            ) {
                Text(
                    text = "SIGN UP",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight(700),
                        lineHeight = 20.sp,
                        letterSpacing = 0.25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Black
                    )
                )
            }
            Spacer(modifier = Modifier.padding(bottom = 16.dp))
            Text(
                text = "Or login/sign up via...",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight(400),
                    lineHeight = 30.sp,
                    letterSpacing = 0.25.sp,
                    textAlign = TextAlign.Center,
                    color = Color.Black
                )
            )
            Spacer(modifier = Modifier.padding(bottom = 24.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(1.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(1.dp)
                        .height(63.dp)
                        .border(
                            width = 1.dp,
                            color = Color(0xFF0C0CD6),
                            shape = RoundedCornerShape(20.dp)
                        )
                        .width(123.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.White
                    )

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.google_logo),
                        contentDescription = "Google",
                        modifier = Modifier
                            .height(39.dp)
                            .width(37.95.dp)
                    )

                }
                Spacer(modifier = Modifier.padding(bottom = 30.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(15.dp)
                        .height(63.dp)
                        .border(
                            width = 1.dp,
                            color = Color(0xFF0C0CD6),
                            shape = RoundedCornerShape(20.dp)
                        )
                        .width(123.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.White
                    )

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.facebook_logo),
                        contentDescription = "Google",
                        modifier = Modifier
                            .height(39.dp)
                            .width(37.95.dp)
                    )

                }
            }
            Spacer(modifier = Modifier.padding(bottom = 5.dp))

        }
    }
}