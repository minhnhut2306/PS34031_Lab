//package com.example.ps34031_lab.BaiTap
//
//import android.os.Bundle
//import android.widget.Toast
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.background
//import androidx.compose.foundation.border
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.text.font.Font
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.ps34031_lab.BaiTap.ui.theme.PS34031_LabTheme
//import com.example.ps34031_lab.R
//
//class Bai11 : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            PS34031_LabTheme {
//                SanPhamScreen()
//            }
//        }
//    }
//}
//
//data class SanPham(val Id: Int, val Tensp: String, val GiaSp: Int)
//
//@Composable
//fun SanPhamScreen() {
//    val context = LocalContext.current
//    var idsp by remember { mutableStateOf("") }
//    var tensp by remember { mutableStateOf("") }
//    var giasp by remember { mutableStateOf("") }
//    val data = remember {
//        mutableStateListOf(
//            SanPham(1, "Cây cao", 100000),
//            SanPham(2, "Cây thấp", 200000),
//            SanPham(3, "Cây hơi cao", 300000),
//            SanPham(4, "Cây hơi thấp", 400000),
//            SanPham(5, "Cây lùn", 500000)
//        )
//    }
//
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .fillMaxHeight()
//            .padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//    ) {
//        OutlinedTextField(
//            value = idsp,
//            onValueChange = { idsp = it },
//            label = { Text("Id") },
//            modifier = Modifier.fillMaxWidth()
//        )
//        OutlinedTextField(
//            value = tensp,
//            onValueChange = { tensp = it },
//            label = { Text("Tên sp") },
//            modifier = Modifier.fillMaxWidth()
//        )
//        OutlinedTextField(
//            value = giasp,
//            onValueChange = { giasp = it },
//            label = { Text("Giá sp") },
//            modifier = Modifier.fillMaxWidth()
//        )
//        Spacer(modifier = Modifier.height(16.dp))
//        Button(
//            onClick = {
//                val id = idsp.toIntOrNull()
//                val name = tensp
//                val price = giasp.toIntOrNull()
//                if (id != null && price != null && name.isNotBlank()) {
//                    val existingProduct = data.find { it.Id == id }
//                    if (existingProduct != null) {
//                        existingProduct.Tensp = name
//                        existingProduct.GiaSp = price
//                        Toast.makeText(context, "Sản phẩm được cập nhật", Toast.LENGTH_SHORT).show()
//                    } else {
//                        data.add(SanPham(id, name, price))
//                        Toast.makeText(context, "Sản phẩm được thêm", Toast.LENGTH_SHORT).show()
//                    }
//                } else {
//                    Toast.makeText(context, "Vui lòng nhập thông tin hợp lệ", Toast.LENGTH_SHORT).show()
//                }
//            },
//            modifier = Modifier.fillMaxWidth(),
//            colors = ButtonDefaults.buttonColors(
//                containerColor = Color(0xFF45BC1B),
//                contentColor = Color.White
//            ),
//            shape = RoundedCornerShape(16.dp)
//        ) {
//            Text(
//                "Thêm/Sửa",
//                color = Color.White,
//                fontSize = 14.sp,
//                fontWeight = FontWeight(700),
//                lineHeight = 22.sp,
//                fontFamily = FontFamily(
//                    Font(R.font.nunito)
//                )
//            )
//        }
//        Spacer(modifier = Modifier.height(16.dp))
//        LazyColumn(modifier = Modifier.fillMaxWidth()) {
//            items(data.size) { index ->
//                val item = data[index]
//                Card(
//                    modifier = Modifier
//                        .padding(8.dp)
//                        .fillMaxWidth()
//                        .clickable {
//                            data.remove(item)
//                            Toast.makeText(context, "Sản phẩm đã xóa", Toast.LENGTH_SHORT).show()
//                        },
//                    shape = RoundedCornerShape(16.dp),
//                    backgroundColor = Color(0xffC0C0C0)
//                ) {
//                    Column(modifier = Modifier.padding(16.dp)) {
//                        Text(text = "ID: ${item.Id}", fontSize = 16.sp, color = Color.Black)
//                        Text(text = "Tên: ${item.Tensp}", fontSize = 16.sp, color = Color.Black)
//                        Text(text = "Giá: ${item.GiaSp} VND", fontSize = 16.sp, color = Color.Black)
//                    }
//                }
//            }
//        }
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun SanPhamPreview() {
//    PS34031_LabTheme {
//        SanPhamScreen()
//    }
//}
