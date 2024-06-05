package com.example.ps34031_lab

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold {
                Cong()
            }
        }
    }
}

@Composable
fun Cong() {
    var soramdoma by remember { mutableStateOf((Math.floor((Math.random() * 10) + 1)).toInt()) }
    var soramdomb by remember { mutableStateOf((Math.floor((Math.random() * 10) + 1)).toInt()) }
    var ketqua by remember { mutableStateOf(soramdoma + soramdomb) }
    var ketquarandom by remember { mutableStateOf((Math.floor(Math.random() * 20) + 1).toInt()) }
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "BẠN GIỎI PHÉP CỘNG?",
            color = Color.Red,
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = "$soramdoma + $soramdomb = \n $ketquarandom",
            color = Color.Blue,
            fontSize = 32.sp,
            textAlign = TextAlign.Center
        )

        Button(
            onClick = {
                if (ketquarandom == ketqua) {
                    Toast.makeText(context, "Chính xác!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Sai rồi!", Toast.LENGTH_SHORT).show()
                }
                soramdoma = (Math.random() * 10 + 1).toInt()
                soramdomb = (Math.random() * 10 + 1).toInt()
                ketqua = soramdoma + soramdomb
                ketquarandom = (Math.random() * 20 + 2).toInt()
            },
            modifier = Modifier
                .padding(top = 20.dp, bottom = 0.dp)
                .width(280.dp)
                .height(45.dp),
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF008000),
                contentColor = Color.White
            ),
            border = BorderStroke(1.dp, Color.Black),
        ) {
            Text(text = "Đúng")
        }

        Button(
            onClick = {
                if (ketquarandom != ketqua) {
                    Toast.makeText(context, "Chính xác!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Sai rồi!", Toast.LENGTH_SHORT).show()
                }
                soramdoma = (Math.random() * 10 + 1).toInt()
                soramdomb = (Math.random() * 10 + 1).toInt()
                ketqua = soramdoma + soramdomb
                ketquarandom = (Math.random() * 20 + 2).toInt()
            },
            modifier = Modifier
                .padding(top = 20.dp, bottom = 0.dp)
                .width(280.dp)
                .height(45.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFC0C0C0),
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(1.dp, Color.Black),
        ) {
            Text(text = "Sai")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CongPreview() {
    Cong()
}
