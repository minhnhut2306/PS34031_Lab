package com.example.ps34031_lab.BaiTap

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ps34031_lab.BaiTap.ui.theme.PS34031_LabTheme
import com.example.ps34031_lab.R

class Bai10 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PS34031_LabTheme {
                SanPham()
            }
        }
    }
}

data class Data(var Id: Int, var Tensp: String, var GiaSp: Int)

@Composable
fun SanPham() {
    val context = LocalContext.current
    var idsp by remember { mutableStateOf("") }
    var tensp by remember { mutableStateOf("") }
    var giasp by remember { mutableStateOf("") }
    val data = remember {
        mutableStateListOf(
            Data(1, "Cây cao", 100000),
            Data(2, "Cây thấp", 200000),
            Data(3, "Cây hơi cao", 300000),
            Data(4, "Cây hơi thấp", 400000),
            Data(5, "Cây lùn", 500000)
        )
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        OutlinedTextField(
            modifier = Modifier
                .padding(top = 40.dp, bottom = 0.dp)
                .fillMaxWidth(0.9f),
            value = idsp,
            onValueChange = { idsp = it },
            label = { Text("Id") }
        )
        OutlinedTextField(
            modifier = Modifier
                .padding(top = 10.dp, bottom = 0.dp)
                .fillMaxWidth(0.9f),
            value = tensp,
            onValueChange = { tensp = it },
            label = { Text("Tên sp") }
        )
        OutlinedTextField(
            modifier = Modifier
                .padding(top = 10.dp, bottom = 0.dp)
                .fillMaxWidth(0.9f),
            value = giasp,
            onValueChange = { giasp = it },
            label = { Text("Giá sp") }
        )
        Row {
            Button(
                onClick = {
                    val id = idsp.toIntOrNull()
                    val ten = tensp
                    val gia = giasp.toIntOrNull()
                    if (id != null && gia != null && ten.isNotBlank()) {
                        val kiemtra = data.find { it.Id == id }
                        if (kiemtra != null) {
                            val index = data.indexOf(kiemtra)
                            data[index] = Data(id, ten, gia)
                            Toast.makeText(context, "Sản phẩm đã được cập nhật", Toast.LENGTH_LONG).show()
                        } else {
                            data.add(Data(id, ten, gia))
                            Toast.makeText(context, "Sản phẩm đã được thêm", Toast.LENGTH_LONG).show()
                        }
                    } else {
                        Toast.makeText(
                            context, "Vui lòng nhập đầy đủ thông tin hợp lệ", Toast.LENGTH_LONG
                        ).show()
                    }
                },
                modifier = Modifier
                    .padding(10.dp)
                    .width(145.dp)
                    .height(45.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF45BC1B), contentColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(
                    "Thêm sửa",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight(700),
                    lineHeight = 22.sp,
                    fontFamily = FontFamily(
                        Font(R.font.nunito)
                    )
                )
            }
            Button(
                onClick = {
                    val id = idsp.toIntOrNull()
                    if (id != null) {
                        val itemToRemove = data.find { it.Id == id }
                        if (itemToRemove != null) {
                            data.remove(itemToRemove)
                            Toast.makeText(context, "Sản phẩm đã được xóa", Toast.LENGTH_LONG).show()
                        } else {
                            Toast.makeText(context, "Không tìm thấy", Toast.LENGTH_LONG).show()
                        }
                    }
                },
                modifier = Modifier
                    .padding(10.dp)
                    .width(145.dp)
                    .height(45.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF45BC1B), contentColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(
                    "Xóa",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight(700),
                    lineHeight = 22.sp,
                    fontFamily = FontFamily(
                        Font(R.font.nunito)
                    )
                )
            }
        }

        Divider(
            color = Color.Black,
            thickness = 1.dp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
        )
        LazyVerticalGrid(columns = GridCells.Fixed(3), modifier = Modifier.fillMaxWidth()) {
            items(data.size) { index ->
                val item = data[index]
                Box(
                    modifier = Modifier
                        .width(50.dp)
                        .height(100.dp)
                        .padding(10.dp)
                        .background(
                            color = Color(0xffC0C0C0), shape = RoundedCornerShape(16.dp)
                        )
                        .clickable {
                            idsp = item.Id.toString()
                            tensp = item.Tensp
                            giasp = item.GiaSp.toString()
                        }
                ) {
                    Column(
                        modifier = Modifier.padding(8.dp),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = item.Tensp, fontSize = 16.sp, color = Color.Black)
                        Text(
                            text = "${item.GiaSp} VND",
                            fontSize = 14.sp,
                            color = Color.Black,
                            modifier = Modifier.align(Alignment.Start)
                        )
                    }
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SanPhamPreview() {
    PS34031_LabTheme {
        SanPham()
    }
}
