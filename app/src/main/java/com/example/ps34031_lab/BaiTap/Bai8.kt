package com.example.ps34031_lab.BaiTap

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ps34031_lab.BaiTap.ui.theme.PS34031_LabTheme
import kotlin.random.Random

class Bai8 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PS34031_LabTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    content = { paddingValues ->
                        Pheptinh(Modifier.padding(paddingValues))
                    }
                )
            }
        }
    }
}

@Composable
fun Pheptinh(modifier: Modifier = Modifier) {
    data class PhepTinh(val so1: Int, val phepTinh: String, val so2: Int, val ketQua: Int)
    val context = LocalContext.current
    val mathInput = remember { mutableStateOf("") }
    val list = listOf(
        PhepTinh(1, "+", 2, 3),
        PhepTinh(3, "-", 2, 1),
        PhepTinh(6, "*", 2, 12),
        PhepTinh(12, "/", 4, 3),
        PhepTinh(8, "*", 4, 32),
        PhepTinh(6, "*", 12, 72),
        PhepTinh(5, "+", 7, 12),
        PhepTinh(10, "-", 4, 6),
        PhepTinh(9, "*", 3, 27),
        PhepTinh(16, "/", 2, 8),
        PhepTinh(14, "+", 5, 19),
        PhepTinh(20, "-", 9, 11),
        PhepTinh(7, "*", 5, 35),
        PhepTinh(18, "/", 3, 6),
        PhepTinh(11, "+", 8, 19),
        PhepTinh(13, "-", 6, 7),
        PhepTinh(4, "*", 4, 16),
        PhepTinh(24, "/", 6, 4),
        PhepTinh(15, "+", 10, 25),
        PhepTinh(25, "-", 5, 20),
        PhepTinh(5, "*", 5, 25)
    )
    val hienthi = remember { mutableStateOf(list.random()) }
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(top = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Giải nghĩa",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp),
        )
        Row(
            modifier = modifier.padding(top = 40.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedTextField(
                value = hienthi.value.so1.toString(),
                onValueChange = { },
                readOnly = true,
                textStyle = TextStyle(
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp
                ),
                modifier = Modifier
                    .width(70.dp)
                    .height(60.dp)
                    .padding(start = 10.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFDAF2D1),
                        shape = RoundedCornerShape(size = 8.dp)
                    )
                    .background(color = Color.White, shape = RoundedCornerShape(size = 8.dp))
            )
            OutlinedTextField(
                value = mathInput.value,
                onValueChange = { mathInput.value = it },
                textStyle = TextStyle(
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp
                ),
                modifier = Modifier
                    .width(70.dp)
                    .height(60.dp)
                    .padding(start = 10.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFDAF2D1),
                        shape = RoundedCornerShape(size = 8.dp)
                    )
                    .background(color = Color.White, shape = RoundedCornerShape(size = 8.dp))
            )
            OutlinedTextField(
                value = hienthi.value.so2.toString(),
                onValueChange = { },
                readOnly = true,
                textStyle = TextStyle(
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp
                ),
                modifier = Modifier
                    .width(70.dp)
                    .height(60.dp)
                    .padding(start = 10.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFDAF2D1),
                        shape = RoundedCornerShape(size = 8.dp)
                    )
                    .background(color = Color.White, shape = RoundedCornerShape(size = 8.dp))
            )
            OutlinedTextField(
                value = "=",
                onValueChange = { },
                readOnly = true,
                textStyle = TextStyle(
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp
                ),
                modifier = Modifier
                    .width(70.dp)
                    .height(60.dp)
                    .padding(start = 10.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFDAF2D1),
                        shape = RoundedCornerShape(size = 8.dp)
                    )
                    .background(color = Color.White, shape = RoundedCornerShape(size = 8.dp))
            )
            OutlinedTextField(
                value = hienthi.value.ketQua.toString(),
                onValueChange = { },
                readOnly = true,
                textStyle = TextStyle(
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp
                ),
                modifier = Modifier
                    .width(70.dp)
                    .height(60.dp)
                    .padding(start = 10.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFDAF2D1),
                        shape = RoundedCornerShape(size = 8.dp)
                    )
                    .background(color = Color.White, shape = RoundedCornerShape(size = 8.dp))
            )
        }
        Button(onClick = {
            val InputText = mathInput.value
            val pheptinh = hienthi.value.phepTinh
            val message = if (InputText == pheptinh) {
                hienthi.value = list.random()
                mathInput.value = ""
                "Bạn nhập đúng"
            } else {
                "Bạn nhập sai vui lòng nhập lại"
            }
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }) {
            Text(text = "Kiểm tra phép tính")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PheptinhPreview() {
    PS34031_LabTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            content = { paddingValues ->
                Pheptinh(Modifier.padding(paddingValues))
            }
        )
    }
}
