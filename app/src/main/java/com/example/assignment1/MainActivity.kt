package com.example.assignment1

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment1.ui.theme.Assignment1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(){
    BusinessCardComplete(
        name = "CJ Apolinar",
        title = "Software Development Student",
        phone = "Phone: 123-456-7890",
        social = "Social: @CJthedeveloper",
        email =  "Email: c.apolinar541@mybvc.ca"


    )
}

@Composable
fun BusinessCardComplete(
    name: String,
    title: String,
    phone: String,
    social: String,
    email: String
) {
    Column(
        modifier = Modifier
            .background(Color(0xFFB2AC88))
            .fillMaxSize()
            .fillMaxHeight()
            .padding(bottom = 100.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        AndroidImage()
        Text(
            text = name,
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
        )
        Text(
            modifier = Modifier
                .padding(top = 10.dp),
            text = title,
            fontSize = 15.sp,

            )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .padding(top = 470.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ){
        Text(
            modifier = Modifier
                .padding(5.dp),
            text = phone,
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold

        )
        Text(
            modifier = Modifier
                .padding(5.dp),
            text = social,
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold
        )
        Text(
            modifier = Modifier
                .padding(5.dp),
            text = email,
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold
        )

    }
}

@Composable
fun AndroidImage() {
    Image(
        painter = painterResource(id = R.drawable.android_logo),
        contentDescription = null,
        modifier = Modifier
            .size(130.dp)
            .padding(10.dp)
            .background(Color(0xFF244C6C))

    )

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assignment1Theme {
        BusinessCard()
    }
}

