package com.example.ps34031_lab.BaiTapLab

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ps34031_lab.Colors
import com.example.ps34031_lab.R
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import androidx.compose.runtime.*

class AcquaintedActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
Acquainted()
        }
    }
}

@Composable
fun Acquainted() {
    val context = LocalContext.current
    val name = remember { mutableStateOf("Nguyễn Minh Nhựt") }
    val formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd")
    var current by remember { mutableStateOf(LocalDateTime.now().format(formatter)) }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Delivery of products",
            color = Colors.Green1,
            lineHeight = 39.sp,
            fontFamily = FontFamily(Font(R.font.nunito)),
            fontSize = 49.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 77.dp)
                .width(295.dp)
                .height(108.dp),
        )
        Text(
            text = "Create a password",
            color = Colors.DarkGray,
            lineHeight = 28.sp,
            fontFamily = FontFamily(Font(R.font.nunito)),
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 97.dp)
                .height(28.dp),
        )
        OutlinedTextField(
            value = name.value,
            onValueChange = { name.value = it },
            label = { Text("Your name", color = Color.Green) },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Green,
                unfocusedBorderColor = Color.Green,
                cursorColor = Color.Black,
            ),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .padding(top = 32.dp, bottom = 0.dp)
        )
        OutlinedTextField(
            value = current,
            onValueChange = { current = it },
            label = { Text("Date of Birth", color = Color.Green) },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Green,
                unfocusedBorderColor = Color.Green,
                cursorColor = Color.Black,
            ),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .padding(top = 10.dp, bottom = 0.dp)
        )

        Button(
            onClick = {
                val intent = Intent(context, AcquaintedActivity::class.java)
                context.startActivity(intent)
            },
            modifier = Modifier
                .padding(top = 50.dp, bottom = 0.dp)
                .width(280.dp)
                .height(45.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF45BC1B),
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                "Continue",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight(700),
                lineHeight = 22.sp,
                fontFamily = FontFamily(
                    Font(R.font.nunito)
                )
            )
        }
        Text(
            text = "Skip this step",
            color = Colors.Green1,
            lineHeight = 22.sp,
            fontFamily = FontFamily(Font(R.font.nunito)),
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 90.dp)
        )

    }
}