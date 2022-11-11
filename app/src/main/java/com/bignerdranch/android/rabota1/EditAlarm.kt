package com.bignerdranch.android.rabota1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.bignerdranch.android.rabota1.ui.theme.*

class EditAlarm : ComponentActivity() {
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
                        GeneralActivity().TextView("Изменить будильник")

                    }
                    Row(modifier = Modifier.offset(x = 170.dp, y = 0.dp)) {

                    }
                    Row() {
                        Timeline()
                    }
                    Row() {
                        Text(text = "Повторять каждый", color = White, modifier = Modifier.offset(x =25.dp, y = 175.dp))
                    }
                    Row() {
                        CheckView()
                    }
                    Row(modifier = Modifier.offset(y = 540.dp)) {
                        val context = LocalContext.current
                        Column (modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentSize(Alignment.Center)
                        ) {
                            Button(onClick = {val intent = Intent(context,GeneralActivity::class.java)
                                ContextCompat.startActivity(context, intent, null)
                            },
                                colors = ButtonDefaults.buttonColors(backgroundColor = Red),
                                modifier = Modifier
                                    .size(340.dp, 50.dp)
                                    .clip(RoundedCornerShape(20))
                            ) {
                                Text(
                                    text = "Удалить будильник",
                                    color = MaterialTheme.colors.background,
                                    fontSize = 18.sp
                                )
                            }
                        }

                    }
                    Row(modifier = Modifier.offset(y=600.dp)) {
                        ButtonAdd7("Создать будильник")
                    }
                }
            }
        }
    }
}


@Composable
fun ButtonAdd7(name: String) {
    val context = LocalContext.current
    Column (modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center)
    ) {
        Button(onClick = {val intent = Intent(context,GeneralActivity::class.java)
            ContextCompat.startActivity(context, intent, null)
        },
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
fun Greeting8(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview8() {
    Rabota1Theme {
        Greeting8("Android")
    }
}