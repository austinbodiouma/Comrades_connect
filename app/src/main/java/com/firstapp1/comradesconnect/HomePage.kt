package com.firstapp1.comradesconnect

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp


@Composable
fun HomePage(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ) {

            Text(
                text = "Comrades Connect",
                style = TextStyle(
                    color = Color(0XFF0000FF),
                    fontWeight = FontWeight(700),
                    fontSize = 24.sp,



                )

            )

            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                modifier = Modifier
                    .height(38.dp)
                    .width(38.dp)
                    .clickable { },
//                color = Color(0XFF0000FF)


            )

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()

                .horizontalScroll(ScrollState(1)),
            horizontalArrangement = Arrangement.SpaceEvenly

        ) {

            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Box(
                    modifier = Modifier
                        .height(57.dp)
                        .width(55.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0XFF0000FF),
                            shape = RoundedCornerShape(20.dp)

                        )
                        .clip(RoundedCornerShape(20.dp)),


                ) {
                    Image(
                        painter = painterResource(id = R.drawable.whatsapp_image_2023_06_02_at_20_08_44),
                        contentDescription = "profile_pic",
                        contentScale = ContentScale.Crop
                    )

                }
                Text(
                    text ="You",
                    style = TextStyle(
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        letterSpacing = 0.1.em
                    )
                )

            }
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Box(
                    modifier = Modifier
                        .height(57.dp)
                        .width(55.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0XFF0000FF),
                            shape = RoundedCornerShape(20.dp)

                        )
                        .clip(RoundedCornerShape(20.dp)),


                    ) {
                    Image(
                        painter = painterResource(id = R.drawable.whatsapp_image_2023_06_02_at_20_08_44),
                        contentDescription = "profile_pic",
                        contentScale = ContentScale.Crop
                    )

                }
                Text(
                    text ="You",
                    style = TextStyle(
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        letterSpacing = 0.1.em
                    )
                )

            }
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Box(
                    modifier = Modifier
                        .height(57.dp)
                        .width(55.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0XFF0000FF),
                            shape = RoundedCornerShape(20.dp)

                        )
                        .clip(RoundedCornerShape(20.dp)),


                    ) {
                    Image(
                        painter = painterResource(id = R.drawable.whatsapp_image_2023_06_02_at_20_08_44),
                        contentDescription = "profile_pic",
                        contentScale = ContentScale.Crop
                    )

                }
                Text(
                    text ="You",
                    style = TextStyle(
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        letterSpacing = 0.1.em
                    )
                )

            }
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Box(
                    modifier = Modifier
                        .height(57.dp)
                        .width(55.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0XFF0000FF),
                            shape = RoundedCornerShape(20.dp)

                        )
                        .clip(RoundedCornerShape(20.dp)),


                    ) {
                    Image(
                        painter = painterResource(id = R.drawable.whatsapp_image_2023_06_02_at_20_08_44),
                        contentDescription = "profile_pic",
                        contentScale = ContentScale.Crop
                    )

                }
                Text(
                    text ="You",
                    style = TextStyle(
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        letterSpacing = 0.1.em
                    )
                )

            }
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Box(
                    modifier = Modifier
                        .height(57.dp)
                        .width(55.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0XFF0000FF),
                            shape = RoundedCornerShape(20.dp)

                        )
                        .clip(RoundedCornerShape(20.dp)),


                    ) {
                    Image(
                        painter = painterResource(id = R.drawable.whatsapp_image_2023_06_02_at_20_08_44),
                        contentDescription = "profile_pic",
                        contentScale = ContentScale.Crop
                    )

                }
                Text(
                    text ="You",
                    style = TextStyle(
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        letterSpacing = 0.1.em
                    )
                )

            }
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Box(
                    modifier = Modifier
                        .height(57.dp)
                        .width(55.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0XFF0000FF),
                            shape = RoundedCornerShape(20.dp)

                        )
                        .clip(RoundedCornerShape(20.dp)),


                    ) {
                    Image(
                        painter = painterResource(id = R.drawable.whatsapp_image_2023_06_02_at_20_08_44),
                        contentDescription = "profile_pic",
                        contentScale = ContentScale.Crop
                    )

                }
                Text(
                    text ="You",
                    style = TextStyle(
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        letterSpacing = 0.1.em
                    )
                )

            }
            Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Box(
                    modifier = Modifier
                        .height(57.dp)
                        .width(55.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0XFF0000FF),
                            shape = RoundedCornerShape(20.dp)

                        )
                        .clip(RoundedCornerShape(20.dp)),


                    ) {
                    Image(
                        painter = painterResource(id = R.drawable.whatsapp_image_2023_06_02_at_20_08_44),
                        contentDescription = "profile_pic",
                        contentScale = ContentScale.Crop
                    )

                }
                Text(
                    text ="You",
                    style = TextStyle(
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        letterSpacing = 0.1.em
                    )
                )

            }

        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .verticalScroll(rememberScrollState()),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = 1.dp,
                        color = Color(0XFF0000FF),
                        shape = RoundedCornerShape(20.dp)

                    )
                    .clip(RoundedCornerShape(20.dp)),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start

                ){
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(2.dp)
                        .wrapContentHeight(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){

                    Box(
                        modifier = Modifier
                            .height(44.dp)
                            .width(44.dp)
                            .padding(2.dp)
                            .border(
                                width = 2.dp,
                                color = Color(0XFF0000FF),
                                shape = RoundedCornerShape(20.dp)

                            )
                            .clip(RoundedCornerShape(20.dp)),


                        ) {
                        Image(
                            painter = painterResource(id = R.drawable.whatsapp_image_2023_06_02_at_20_08_44),
                            contentDescription = "profile_pic",
                            contentScale = ContentScale.Crop
                        )

                    }
                    Column() {
                        Text(text =" Frank",
                            style = TextStyle(
                                color = Color.Black,
                                fontWeight = FontWeight(500),
                                fontSize = 20.sp,

                            )
                        )
                        Text(text =" Nairobi, Kenya",
                            style = TextStyle(
                                color = Color.Black,
                                fontWeight = FontWeight(400),
                                fontSize = 15.sp,

                            )
                        )


                    }
                    Spacer(modifier = Modifier.padding(40.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(),

                        horizontalAlignment = Alignment.End,
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        Spacer(modifier = Modifier.padding(16.dp))

                        Text(text =" 22 minutes ago",
                            style = TextStyle(
                                color = Color.Black,
                                fontWeight = FontWeight(300),
                                fontSize = 14.sp,

                                )
                        )

                    }

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(8.dp)


                ) {

                    Image(
                        painter = painterResource(id = R.drawable.whatsapp_image_2023_06_02_at_20_08_44),
                        contentDescription = "profile_pic",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)

                    )

                }
            }
            Spacer(modifier = Modifier.padding(8.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = 1.dp,
                        color = Color(0XFF0000FF),
                        shape = RoundedCornerShape(20.dp)

                    )
                    .clip(RoundedCornerShape(20.dp)),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start

            ){
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(2.dp)
                        .wrapContentHeight(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){

                    Box(
                        modifier = Modifier
                            .height(44.dp)
                            .width(44.dp)
                            .padding(2.dp)
                            .border(
                                width = 2.dp,
                                color = Color(0XFF0000FF),
                                shape = RoundedCornerShape(20.dp)

                            )
                            .clip(RoundedCornerShape(20.dp)),


                        ) {
                        Image(
                            painter = painterResource(id = R.drawable.whatsapp_image_2023_06_02_at_20_08_44),
                            contentDescription = "profile_pic",
                            contentScale = ContentScale.Crop
                        )

                    }
                    Column() {
                        Text(text =" Frank",
                            style = TextStyle(
                                color = Color.Black,
                                fontWeight = FontWeight(500),
                                fontSize = 20.sp,

                                )
                        )
                        Text(text =" Nairobi, Kenya",
                            style = TextStyle(
                                color = Color.Black,
                                fontWeight = FontWeight(400),
                                fontSize = 15.sp,

                                )
                        )


                    }
                    Spacer(modifier = Modifier.padding(40.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(),

                        horizontalAlignment = Alignment.End,
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        Spacer(modifier = Modifier.padding(16.dp))

                        Text(text =" 22 minutes ago",
                            style = TextStyle(
                                color = Color.Black,
                                fontWeight = FontWeight(300),
                                fontSize = 14.sp,

                                )
                        )

                    }

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(8.dp)


                ) {

                    Image(
                        painter = painterResource(id = R.drawable.whatsapp_image_2023_06_02_at_20_08_44),
                        contentDescription = "profile_pic",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)

                        )
                   }

                }

            }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    width = 1.dp,
                    color = Color(0XFF0000FF),
                    shape = RoundedCornerShape(20.dp)

                )
                .clip(RoundedCornerShape(20.dp)),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start

        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(2.dp)
                    .wrapContentHeight(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){

                Box(
                    modifier = Modifier
                        .height(44.dp)
                        .width(44.dp)
                        .padding(2.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0XFF0000FF),
                            shape = RoundedCornerShape(20.dp)

                        )
                        .clip(RoundedCornerShape(20.dp)),


                    ) {
                    Image(
                        painter = painterResource(id = R.drawable.whatsapp_image_2023_06_02_at_20_08_44),
                        contentDescription = "profile_pic",
                        contentScale = ContentScale.Crop
                    )

                }
                Column() {
                    Text(text =" Frank",
                        style = TextStyle(
                            color = Color.Black,
                            fontWeight = FontWeight(500),
                            fontSize = 20.sp,

                            )
                    )
                    Text(text =" Nairobi, Kenya",
                        style = TextStyle(
                            color = Color.Black,
                            fontWeight = FontWeight(400),
                            fontSize = 15.sp,

                            )
                    )


                }
                Spacer(modifier = Modifier.padding(40.dp))
                Column(
                    modifier = Modifier
                        .fillMaxHeight(),

                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Spacer(modifier = Modifier.padding(16.dp))

                    Text(text =" 22 minutes ago",
                        style = TextStyle(
                            color = Color.Black,
                            fontWeight = FontWeight(300),
                            fontSize = 14.sp,

                            )
                    )

                }

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(8.dp)


            ) {

                Image(
                    painter = painterResource(id = R.drawable.whatsapp_image_2023_06_02_at_20_08_44),
                    contentDescription = "profile_pic",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)

                )
            }

        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    width = 1.dp,
                    color = Color(0XFF0000FF),
                    shape = RoundedCornerShape(20.dp)

                )
                .clip(RoundedCornerShape(20.dp)),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start

        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(2.dp)
                    .wrapContentHeight(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){

                Box(
                    modifier = Modifier
                        .height(44.dp)
                        .width(44.dp)
                        .padding(2.dp)
                        .border(
                            width = 2.dp,
                            color = Color(0XFF0000FF),
                            shape = RoundedCornerShape(20.dp)

                        )
                        .clip(RoundedCornerShape(20.dp)),


                    ) {
                    Image(
                        painter = painterResource(id = R.drawable.whatsapp_image_2023_06_02_at_20_08_44),
                        contentDescription = "profile_pic",
                        contentScale = ContentScale.Crop
                    )

                }
                Column() {
                    Text(text =" Frank",
                        style = TextStyle(
                            color = Color.Black,
                            fontWeight = FontWeight(500),
                            fontSize = 20.sp,

                            )
                    )
                    Text(text =" Nairobi, Kenya",
                        style = TextStyle(
                            color = Color.Black,
                            fontWeight = FontWeight(400),
                            fontSize = 15.sp,

                            )
                    )


                }
                Spacer(modifier = Modifier.padding(40.dp))
                Column(
                    modifier = Modifier
                        .fillMaxHeight(),

                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Spacer(modifier = Modifier.padding(16.dp))

                    Text(text =" 22 minutes ago",
                        style = TextStyle(
                            color = Color.Black,
                            fontWeight = FontWeight(300),
                            fontSize = 14.sp,

                            )
                    )

                }

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(8.dp)


            ) {

                Image(
                    painter = painterResource(id = R.drawable.whatsapp_image_2023_06_02_at_20_08_44),
                    contentDescription = "profile_pic",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)

                )
            }

        }

    }


}


@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {

      HomePage()

}