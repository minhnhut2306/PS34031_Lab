package com.example.ps34031_lab.Lab.Lab4

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ps34031_lab.R

class Lab4Bai2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold {
                Lab4Bai2Content(this)
            }
        }
    }
}

@Composable
fun Lab4Bai2Content(activity: ComponentActivity) {
    Scaffold {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Logo",
                modifier = Modifier.size(70.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            val images = listOf(
                R.drawable.anh_01,
                R.drawable.anh_02,
                R.drawable.anh_03,
                R.drawable.anh_04
            )
            HorizontalImageList(images.take(2))
            VerticalImageList(images.drop(2))
            Buttonclick(activity)
        }
    }
}


@Composable
fun HorizontalImageList(imageList: List<Int>) {
    Row(
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .fillMaxWidth()
    ) {
        for (image in imageList) {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 0.dp, end = 22.dp)
                    .size(145.dp, 170.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable
fun VerticalImageList(imageList: List<Int>) {
    Column(
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .fillMaxWidth()
            .padding(top = 10.dp, bottom = 10.dp)
    ) {
        for (image in imageList) {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .size(314.dp, 170.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable
fun Buttonclick(activity: ComponentActivity) {
    Button(
        onClick = {
            val intent = Intent(activity, Lab4Bai3::class.java)
            activity.startActivity(intent)
        },
        modifier = Modifier
            .padding(top = 10.dp, bottom = 0.dp)
            .width(310.dp)
            .height(45.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFFF9900),
            contentColor = Color.White
        ),
        border = BorderStroke(1.dp, Color.Black),
    ) {
        Text(
            "Chuyển sang bài 3",
            color = Color.Black,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
    }
}