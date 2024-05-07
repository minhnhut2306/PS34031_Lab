package com.example.ps34031_lab.Lab.Lab3

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ps34031_lab.Colors

class Lab3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            GreetingContent();
            CounterCard()

        }
    }
}
@Composable
fun GreetingContent() {
    var greetingText by remember { mutableStateOf("Xin chào") }
    var tentext by remember { mutableStateOf("Tôi tên là: ") }
    var massvtext by remember { mutableStateOf("Mã số sinh viên: ") }
    var loptext by remember { mutableStateOf("Lớp: ") }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MessageCard(
            name = "Nguyễn Minh Nhựt",
            studentcode = "PS34031",
            Class = "MD18306",
            greetingText = greetingText,
            tentext = tentext,
            massvtext = massvtext,
            loptext = loptext
        )

        Button(
            onClick = { greetingText = "Hi!";tentext = "My name is: ";massvtext="Student Code: ";loptext="Class: " },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text(text = "Say Hi")
        }
    }
}


@Composable
fun MessageCard(name: String,  studentcode: String, Class: String, greetingText: String,tentext: String,massvtext:String,loptext:String) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .border(1.dp, Color.Red)
        ) {
            Column(
                modifier = Modifier
                    .padding(vertical = 12.dp, horizontal = 16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(
                    text = greetingText,
                    color = Colors.Crimson,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "$tentext $name",
                    color = Color.Black,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "$massvtext $studentcode",
                    color = Color.Black,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "$loptext $Class",
                    color = Color.Black,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
    }
}
@Composable
fun CounterCard() {
    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 200.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("You have clicked the button $count times.")

        Button(onClick = { count++ }) {
            Text("Click me")
        }

        Column(modifier = Modifier.padding(vertical = 8.dp)) {
            Spacer(
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth()
                    .border(width = 1.dp, color = Color.Black)
            )
        }
    }
}