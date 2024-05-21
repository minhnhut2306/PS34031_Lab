package com.example.ps34031_lab.BaiTapLab

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.material.*
import androidx.compose.material3.ButtonDefaults
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
import com.example.ps34031_lab.Lab.Lab4.Lab4Bai2
import com.example.ps34031_lab.R


class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Login()
        }
    }
}

@Composable
fun Login() {
    val context = LocalContext.current
    val phoneNumber = remember { mutableStateOf("") }
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
            text = "Authorization or registration",
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
            value = phoneNumber.value,
            onValueChange = { phoneNumber.value = it },
            label = { Text("Enter phone numbe2r", color = Color.Green) },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add Icon",
                    tint = Color.Black,
                    modifier = Modifier
                        .padding(end = 20.dp)
                        .size(20.dp)
                )
                Text(
                    text = "84",
                    color = Color.Black,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(start = 15.dp)
                )
            },
            colors = androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Green,
                unfocusedBorderColor = Color.Green,
                cursorColor = Color.Black,
            ),
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .padding(top =  32.dp, bottom = 0.dp)
        )
        Button(
            onClick = {
                val intent = Intent(context, LoginSMSActivity::class.java)
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
            Text("Continue", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight(700), lineHeight = 22.sp,fontFamily = FontFamily(Font(R.font.nunito)))
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

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    Login()
}
