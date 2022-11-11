package com.bignerdranch.android.rabota1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.android.rabota1.ui.theme.*

class GeneralActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Rabota1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = GreenColor
                ) {
                        Row(modifier = Modifier.offset(x = 25.dp, y = 25.dp)) {
                        TextView("Список дел")

                    }
                    Row(modifier = Modifier.offset(x = 170.dp, y = 0.dp)) {
                        IconView("")
                    }
                    Row() {
                        RoundedCornerShapeDemo()
                    }
                    Row (horizontalArrangement = Arrangement.Center, modifier = Modifier.offset(y = 500.dp)){
                        ButtonAdd("Добавить задачу")
                    }
                    Row (){
                        BottomPanel("")
                    }
                }
            }
        }
    }

    @Composable
    fun TextView(name: String) {
        Text(name,
            color = White,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )

    }
    @Composable
    fun IconView(name: String){
        val context = LocalContext.current
        Image(
            painter = painterResource(id = R.drawable.avatar),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .offset(x = 150.dp, y = 15.dp)
                .size(60.dp).clickable(onClick={
                    val intent = Intent(context, ProfileActivity::class.java)
                    startActivity(intent, null)})
        )
    }

    @Composable
    fun RoundedCornerShapeDemo(){
        ExampleBox(shape = RoundedCornerShape(20.dp), style = Stroke(width=30f))
    }

    @Composable
    fun ExampleBox(shape: RoundedCornerShape, style: DrawStyle) {
        val context = LocalContext.current
        Column(
            Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)){
            Spacer(modifier = Modifier.size(100.dp))
            Box(modifier = Modifier
                .size(340.dp, 90.dp)
                .shadow(
                    10.dp, RoundedCornerShape(
                        topStart = 30.dp,
                        topEnd = 0.dp,
                        bottomEnd = 30.dp,
                        bottomStart = 0.dp
                    )
                )
                .clip(
                    RoundedCornerShape(
                        topStart = 30.dp,
                        topEnd = 0.dp,
                        bottomEnd = 30.dp,
                        bottomStart = 0.dp
                    )
                )
                .background(Orange).clickable(onClick =
                {
                    val intent = Intent(context, EditTaskActivity::class.java)
                    startActivity(intent, null)
                })){
                Text(text = "Вечерний поход в кино", fontSize = 20.sp, color = White, fontWeight = FontWeight.Bold, modifier = Modifier.offset(x = 15.dp, y=15.dp))
                Text(text = "Идем в кино с коллегами!", fontSize = 13.sp, color = Gray, modifier = Modifier.offset(x=15.dp, y=45.dp))
                Text(text = "10.02.2021\n 19:40", fontSize = 13.sp, color = Gray, modifier = Modifier.offset(x=260.dp, y=25.dp))
            }
            Spacer(modifier = Modifier.size(20.dp))
            Box(modifier = Modifier
                .size(340.dp, 90.dp)
                .shadow(
                    10.dp, RoundedCornerShape(
                        topStart = 30.dp,
                        topEnd = 0.dp,
                        bottomEnd = 30.dp,
                        bottomStart = 0.dp
                    )
                )
                .clip(
                    RoundedCornerShape(
                        topStart = 30.dp,
                        topEnd = 0.dp,
                        bottomEnd = 30.dp,
                        bottomStart = 0.dp
                    )
                )
                .background(Orange).clickable(onClick =
                {
                    val intent = Intent(context, EditTaskActivity::class.java)
                    startActivity(intent, null)
                })){
                Row(){}
                Text(text = "Забрать заказ Ozon", fontSize = 20.sp, color = White, fontWeight = FontWeight.Bold, modifier = Modifier.padding(15.dp))
                Text(text = "Пункт выдачи на ул. Ленина, 103", fontSize = 13.sp, color = Gray, modifier = Modifier.offset(x=15.dp, y=45.dp))
                Text(text = "10.02.2021\n 19:40", fontSize = 13.sp, color = Gray, modifier = Modifier.offset(x=260.dp, y=25.dp))
            }
            Spacer(modifier = Modifier.size(20.dp))
            Box(modifier = Modifier
                .size(340.dp, 90.dp)
                .shadow(
                    10.dp, RoundedCornerShape(
                        topStart = 30.dp,
                        topEnd = 0.dp,
                        bottomEnd = 30.dp,
                        bottomStart = 0.dp
                    )
                )
                .clip(
                    RoundedCornerShape(
                        topStart = 30.dp,
                        topEnd = 0.dp,
                        bottomEnd = 30.dp,
                        bottomStart = 0.dp
                    )
                )
                .background(Orange).clickable(onClick =
                {
                    val intent = Intent(context, EditTaskActivity::class.java)
                    startActivity(intent, null)
                })){
                Text(text = "Запись в автосервис", fontSize = 20.sp, color = White, fontWeight = FontWeight.Bold, modifier = Modifier.padding(15.dp))
                Text(text = "Сдать автомобиль в автосервис на ул.\n" +
                        "Бисертская, д. 14. Замена масла", fontSize = 13.sp, color = Gray, modifier = Modifier.offset(x=15.dp, y=45.dp))
                Text(text = "10.02.2021\n 19:40", fontSize = 13.sp, color = Gray, modifier = Modifier.offset(x=260.dp, y=25.dp))
            }
        }

    }
    @Composable
    fun ButtonAdd(name: String) {
        Column (modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center)
            ) {
            Button(onClick = {val intent = Intent(this@GeneralActivity,AddTaskActivity::class.java)
                startActivity(intent)},
                colors = ButtonDefaults.buttonColors(backgroundColor = LightGreen),
                modifier = Modifier
                    .size(340.dp, 50.dp)
                    .clip(RoundedCornerShape(20))
            ) {
                Text(
                    text = name,
                    color = MaterialTheme.colors.background,
                    fontSize = 18.sp
                )
            }
        }
    }

    @Composable
    fun BottomPanel(name: String) {

        val context = LocalContext.current

        Column(modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center)
            .offset(y = 580.dp)) {
            Box(modifier = Modifier
                .size(320.dp, 80.dp)
                .shadow(
                    20.dp,
                    RoundedCornerShape(
                        topStart = 30.dp,
                        topEnd = 30.dp,
                        bottomEnd = 0.dp,
                        bottomStart = 0.dp,
                    )
                )
                .clip(
                    RoundedCornerShape(
                        topStart = 30.dp,
                        topEnd = 30.dp,
                        bottomEnd = 0.dp,
                        bottomStart = 0.dp,
                    )
                )
                .background(LightGreen),
            ){
                Row(modifier = Modifier.padding(all = 8.dp)) {
                    Column (modifier = Modifier.padding(start = 24.dp, top = 8.dp)) {
                        Image(
                            painter = painterResource(R.drawable.list),
                            contentDescription = "List",
                            modifier = Modifier
                                .size(40.dp).clickable(onClick =
                                {
                                    val intent = Intent(context, GeneralActivity::class.java)
                                    startActivity(intent, null)
                                })
                        )
                        Text(
                            text = "List",
                            color = Green,
                            modifier = Modifier
                                .width(40.dp)
                                .wrapContentSize(Alignment.Center),
                            fontSize = 10.sp
                        )
                    }
                    Column (modifier = Modifier.padding(start = 32.dp, top = 8.dp)) {
                        Image(
                            painter = painterResource(R.drawable.clock),
                            contentDescription = "Alarm",
                            modifier = Modifier
                                .size(40.dp)
                                .clickable(onClick =
                                {
                                    val intent = Intent(context, AlarmActivity::class.java)
                                    startActivity(intent, null)
                                })
                        )
                        Text(
                            text = "Alarm",
                            color = Red,
                            modifier = Modifier
                                .width(40.dp)
                                .wrapContentSize(Alignment.Center),
                            fontSize = 10.sp
                        )
                    }
                    Column (modifier = Modifier.padding(start = 32.dp, top = 8.dp)) {
                        Image(
                            painter = painterResource(R.drawable.calendar),
                            contentDescription = "List",
                            modifier = Modifier
                                .size(40.dp)
                                .clickable(onClick =
                                {
                                    val intent = Intent(context, CalendarActivity::class.java)
                                    startActivity(intent, null)
                                })
                        )
                        Text(
                            text = "Calendar",
                            color = Red,
                            modifier = Modifier
                                .width(40.dp)
                                .wrapContentSize(Alignment.Center),
                            fontSize = 10.sp
                        )
                    }
                    Column (modifier = Modifier.padding(start = 32.dp, top = 8.dp)) {
                        Image(
                            painter = painterResource(R.drawable.settings),
                            contentDescription = "Settings",
                            modifier = Modifier
                                .size(40.dp)
                                .clickable(onClick =
                                {
                                    val intent = Intent(context, SettingsActivity::class.java)
                                    startActivity(intent, null)
                                })
                        )
                        Text(
                            text = "Settings",
                            color = Red,
                            modifier = Modifier
                                .width(40.dp)
                                .wrapContentSize(Alignment.Center),
                            fontSize = 10.sp
                        )
                    }
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        Rabota1Theme {
                TextView("")
                IconView("")
        }
    }
}