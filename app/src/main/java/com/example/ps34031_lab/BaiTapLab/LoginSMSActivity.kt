package com.example.ps34031_lab.BaiTapLab

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ps34031_lab.Colors
import com.example.ps34031_lab.R

class LoginSMSActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginSMS()
        }
    }
}

@Composable
fun LoginSMS() {
    val context = LocalContext.current
    val number1 = remember { mutableStateOf("") }
    val number2 = remember { mutableStateOf("") }
    val number3 = remember { mutableStateOf("") }
    val number4 = remember { mutableStateOf("") }

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
            text = "Enter code from SMS",
            color = Colors.DarkGray,
            lineHeight = 28.sp,
            fontFamily = FontFamily(Font(R.font.nunito)),
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 30.dp)
                .height(28.dp),
        )
        Text(
            text = buildAnnotatedString {
                append("We have sent a message to\n")
                append("phone")
                withStyle(style = SpanStyle(color = Color.Black)) {
                    append("  +84 333 845 232")
                }

            },
            color = Colors.Gray,
            lineHeight = 23.sp,
            fontSize = 16.sp,
            fontWeight = FontWeight(500),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 30.dp)
                .height(44.dp),
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            TextField(
                value = number1.value,
                onValueChange = { number1.value = it },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                textStyle = TextStyle(
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp
                ),
                modifier = Modifier
                    .width(51.dp)
                    .height(51.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFDAF2D1),
                        shape = RoundedCornerShape(size = 8.dp)
                    )
                    .background(color = Color.White, shape = RoundedCornerShape(size = 8.dp))
            )
            TextField(
                value = number2.value,
                onValueChange = { number2.value = it },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                textStyle = TextStyle(
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp
                ),
                modifier = Modifier
                    .width(51.dp)
                    .height(51.dp)
                    .padding(start = 10.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFDAF2D1),
                        shape = RoundedCornerShape(size = 8.dp)
                    )
                    .background(color = Color.White, shape = RoundedCornerShape(size = 8.dp))
            )
            TextField(
                value = number3.value,
                onValueChange = { number3.value = it },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                textStyle =
                TextStyle(color = Color.Black, textAlign = TextAlign.Center, fontSize = 18.sp),
                modifier = Modifier
                    .width(51.dp)
                    .height(51.dp)
                    .padding(start = 10.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFDAF2D1),
                        shape = RoundedCornerShape(size = 8.dp)
                    )
                    .background(color = Color.White, shape = RoundedCornerShape(size = 8.dp))
            )
            TextField(
                value = number4.value,
                onValueChange = { number4.value = it },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                textStyle = TextStyle(
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp
                ),
                modifier = Modifier
                    .width(51.dp)
                    .height(51.dp)
                    .padding(start = 10.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFDAF2D1),
                        shape = RoundedCornerShape(size = 8.dp)
                    )
                    .background(color = Color.White, shape = RoundedCornerShape(size = 8.dp))
            )

        }

        Button(
            onClick = {
                val intent = Intent(context, PasswordActivity::class.java)
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
            text = "By clicking on the \"Confirm Login\" button, I agree to the terms of use of the service",
            color = Colors.Gray,
            lineHeight = 17.sp,
            fontSize = 12.sp,
            fontWeight = FontWeight(500),
            modifier = Modifier
                .padding(top = 24.dp)
                .width(278.dp)
                .height(108.dp),
        )
    }
}
