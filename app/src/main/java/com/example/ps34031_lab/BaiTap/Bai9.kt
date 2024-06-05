package com.example.ps34031_lab.BaiTap

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ps34031_lab.R
import com.example.ps34031_lab.BaiTap.ui.theme.PS34031_LabTheme

class Bai9 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PS34031_LabTheme {
                Baitap9()
            }
        }
    }
}

data class Congiap(val MaCV: Int, val AnhDV: Int, val TenDV: String)

@Composable
fun Baitap9() {
    val context = LocalContext.current
    val data = remember {
        mutableStateListOf(
            Congiap(1, R.drawable.anhchuot, "Chuột"),
            Congiap(2, R.drawable.anhtrau, "Trâu"),
            Congiap(3, R.drawable.anhho, "Hổ"),
            Congiap(4, R.drawable.anhmeo, "Mèo"),
            Congiap(5, R.drawable.anhrong, "Rồng"),
            Congiap(6, R.drawable.anhran, "Rắn"),
            Congiap(7, R.drawable.anhngua, "Ngựa"),
            Congiap(8, R.drawable.anhde, "Dê"),
            Congiap(9, R.drawable.anhkhi, "Khỉ"),
            Congiap(10, R.drawable.anhga, "Gà"),
            Congiap(11, R.drawable.anhcho, "Chó"),
            Congiap(12, R.drawable.anhheo, "Heo"),
            Congiap(1, R.drawable.anhchuot, "Chuột"),
            Congiap(2, R.drawable.anhtrau, "Trâu"),
            Congiap(3, R.drawable.anhho, "Hổ"),
            Congiap(4, R.drawable.anhmeo, "Mèo"),
            Congiap(5, R.drawable.anhrong, "Rồng"),
            Congiap(6, R.drawable.anhran, "Rắn"),
            Congiap(7, R.drawable.anhngua, "Ngựa"),
            Congiap(8, R.drawable.anhde, "Dê"),
            Congiap(9, R.drawable.anhkhi, "Khỉ"),
            Congiap(10, R.drawable.anhga, "Gà"),
            Congiap(11, R.drawable.anhcho, "Chó"),
            Congiap(12, R.drawable.anhheo, "Heo")
        )
    }

    val removeItems = remember { mutableStateListOf<Int>() }
    val firstClick = remember { mutableStateOf<Pair<Int, Int>?>(null) }
    val clickCount = remember { mutableStateOf(0) }

    fun check(index: Int, maCV: Int) {
        val first = firstClick.value
        if (first == null) {
            firstClick.value = Pair(index, maCV)
            clickCount.value = 1
        } else {
            if (first.first == index) {

                firstClick.value = null
                clickCount.value = 0
            } else if (first.second == maCV) {
                removeItems.add(first.first)
                removeItems.add(index)
                firstClick.value = null
                clickCount.value = 0
            } else {
                firstClick.value = Pair(index, maCV)
                clickCount.value = 1
            }
        }
    }

    LazyVerticalGrid(columns = GridCells.Fixed(4), modifier = Modifier.fillMaxWidth()) {
        items(data.size) { index ->
            val item = data[index]
            if (!removeItems.contains(index)) {
                Card(
                    modifier = Modifier
                        .padding(5.dp)
                        .clickable {
                            Toast
                                .makeText(context, item.TenDV, Toast.LENGTH_SHORT)
                                .show()
                            check(index, item.MaCV)
                        }
                ) {
                    Box(
                        modifier = Modifier
                            .size(100.dp)
                            .background(
                                color = Color(0xffC0C0C0),
                                shape = RoundedCornerShape(16.dp)
                            )
                            .border(
                                width = 2.dp,
                                color = Color.Gray,
                                shape = RoundedCornerShape(16.dp)
                            )
                    ) {
                        Image(
                            painter = painterResource(id = item.AnhDV),
                            contentDescription = null,
                            modifier = Modifier
                                .size(65.dp)
                                .align(Alignment.Center)
                                .clip(RoundedCornerShape(12.dp))
                                .background(color = Color.Transparent),
                            contentScale = ContentScale.Crop
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Baitap9Preview() {
    PS34031_LabTheme {
        Baitap9()
    }
}
