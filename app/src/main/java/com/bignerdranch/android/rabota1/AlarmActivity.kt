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
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.bignerdranch.android.rabota1.ui.theme.*

class AlarmActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Rabota1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = GreenColor
                ) {
                    Row(modifier = Modifier.offset(x = 20.dp, y = 20.dp)) {
                        GeneralActivity().TextView("Будильник")

                    }
                    Row(modifier = Modifier.offset(x = 170.dp, y = 0.dp)) {
                       IconView2("")
                    }
                    Row (modifier = Modifier.offset(x = 0.dp, y = 500.dp)){
                        ButtonAdd("Добавить будильник")
                    }
                    Row {
                        BottomPanel2("")
                    }
                    Row {
                        Column() {
                            SwitcherView("07:30")
                            SwitcherView("08:00")
                        }
                        }
                    }
                }
            }
        }
    }

@Composable
fun ButtonAdd(name: String) {
    val context = LocalContext.current
    Column (modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center)
    ) {
        Button(onClick = {val intent = Intent(context,CreateAlarmActivity::class.java)
            startActivity(context,intent, null)},
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
fun IconView2(name: String){
    val context = LocalContext.current
    Image(
        painter = painterResource(id = R.drawable.avatar),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .offset(x = 150.dp, y = 15.dp)
            .size(60.dp).clickable(onClick={
                val intent = Intent(context, ProfileActivity::class.java)
                startActivity(context, intent, null)})
    )
}

@Composable
fun BottomPanel2(name: String) {
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
                        painter = painterResource(R.drawable.rlist),
                        contentDescription = "List",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable(onClick =
                            {
                                val intent = Intent(context, GeneralActivity::class.java)
                                startActivity(context, intent, null)
                            })
                    )
                    Text(
                        text = "List",
                        color = Red,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center),
                        fontSize = 10.sp
                    )
                }
                Column (modifier = Modifier.padding(start = 32.dp, top = 8.dp)) {
                    Image(
                        painter = painterResource(R.drawable.galarm),
                        contentDescription = "Alarm",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable(onClick =
                            {
                                val intent = Intent(context, AlarmActivity::class.java)
                                startActivity(context, intent, null)
                            })
                    )
                    Text(
                        text = "Alarm",
                        color = GreenColor,
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
                                startActivity(context, intent, null)
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
                                startActivity(context, intent, null)
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


    @Composable
    fun SwitcherView(name: String) {
        val context = LocalContext.current
        val checkedState1 = remember { mutableStateOf(false)}
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.clickable(onClick =
        {
            val intent = Intent(context, EditAlarm::class.java)
            startActivity(context ,intent, null)
        })) {
            Text(
                text = name,
                fontSize = 60.sp,
                modifier = Modifier
                    .padding(5.dp)
                    .offset(x = 25.dp, y = 125.dp),
                color = White,
                fontWeight = FontWeight.Light
            )
            Switch(checked = checkedState1.value, onCheckedChange = {
                checkedState1.value = it
            },
            colors = SwitchDefaults.colors(
                checkedThumbColor = White,
                checkedTrackColor = LightGreen,
                uncheckedThumbColor = White,
                uncheckedTrackColor = Red
            ),
                modifier = Modifier
                    .size(90.dp, 45.dp)
                    .offset(x = 125.dp, y = 125.dp)
                    .background(
                        color = if (checkedState1.value) {
                            LightGreen
                        } else {
                            Red
                        }, shape = RoundedCornerShape(25.dp)
                    ))
        }

    }


    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name!")
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        Rabota1Theme {
            Greeting("Android")
        }
    }