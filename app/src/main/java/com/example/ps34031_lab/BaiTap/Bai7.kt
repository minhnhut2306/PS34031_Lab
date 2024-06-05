package com.example.ps34031_lab.BaiTap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.example.ps34031_lab.BaiTap.ui.theme.PS34031_LabTheme
import com.example.ps34031_lab.R

class Bai7 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PS34031_LabTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    demo3()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun demo3() {
    var xanh by remember {
        mutableStateOf(0)
    }
    var red by remember {
        mutableStateOf(0)
    }
    var tim by remember {
        mutableStateOf(0)
    }

    fun total(number: Int): String {
        if (xanh + red + tim == 0) {
            return "0.0"
        }
        return String.format("%.2f", number.toDouble() / (xanh + red + tim) * 100)
    }
    Column(
        modifier = Modifier
            .padding(15.dp)
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Text(
            text = "BÌNH CHỌN",
            fontSize = 16.sp,
            modifier = Modifier
                .background(color = Color.Blue)
                .fillMaxWidth()
                .padding(10.dp)
        )
        Row(
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "Flower",
                modifier = Modifier
                    .background(color = Color.Blue)
                    .width(120.dp)
                    .height(150.dp),
                contentScale = ContentScale.Crop
            )
            Column {
                Text(
                    text = "ĐỘC THÂN : ${total(xanh)}%",
                    fontWeight = FontWeight(600),
                    fontSize = 18.sp,
                    color = Color.Green,
                    modifier = Modifier.padding(start = 15.dp)
                )
                Text(
                    text = "ĐÃ CÓ CHỦ : ${total(red)}%",
                    fontWeight = FontWeight(600),
                    fontSize = 18.sp,
                    color = Color.Red,
                    modifier = Modifier.padding(start = 15.dp, top = 20.dp)

                )
                Text(
                    text = "LGBT : ${total(tim)}%",
                    fontWeight = FontWeight(600),
                    fontSize = 18.sp,
                    color = Color.Magenta,
                    modifier = Modifier.padding(start = 15.dp, top = 20.dp)

                )
            }
        }


        Button(
            onClick = { xanh++ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .padding(top = 20.dp)
                .align(alignment = Alignment.CenterHorizontally)
                .padding(10.dp)
                .fillMaxWidth()
                .height(150.dp)

        ) {
            Text(
                text = "ĐỘC THÂN ",
                color = Color.White,
                fontWeight = FontWeight(600),
                fontSize = 18.sp,

                )
        }
        Button(
            onClick = { red++ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(10.dp)
                .fillMaxWidth()
                .height(150.dp)

        ) {
            Text(
                text = "ĐÃ CÓ CHỦ ",
                color = Color.White,
                fontWeight = FontWeight(600),
                fontSize = 18.sp,

                )
        }
        Button(
            onClick = { tim++ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(10.dp)
                .fillMaxWidth()
                .height(150.dp)

        ) {
            Text(
                text = "LGBT ",
                color = Color.White,
                fontWeight = FontWeight(600),
                fontSize = 18.sp,

                )
        }

    }
}