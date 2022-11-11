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
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.bignerdranch.android.rabota1.ui.theme.*

class SettingsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Rabota1Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = GreenColor) {
                    Row(modifier = Modifier.offset(x = 20.dp, y = 20.dp)) {
                        GeneralActivity().TextView("Настройки")

                    }
                    Row(modifier = Modifier.offset(x = 170.dp, y = 0.dp)) {
                        IconView4("")
                    }
                    Row {
                        BottomPanel4("")
                    }
                    Row {
                        Texts()
                    }
                }
                }
            }
        }
    }


@Composable
fun Texts(){
    val context = LocalContext.current
    Column(modifier = Modifier.offset(x = 10.dp, y=100.dp)) {
    Row(horizontalArrangement = Arrangement.End) {
    Text(text = "Профиль пользователя", fontSize = 20.sp, color = White, fontWeight = FontWeight.Bold, modifier = Modifier.offset(x = 15.dp).clickable (onClick =
        {
            val intent = Intent(context, ProfileActivity::class.java)
            startActivity(context ,intent, null)
        }))
    Image(painter = painterResource(id = R.drawable.vector),
    contentDescription = null,
    contentScale = ContentScale.Crop,
    modifier = Modifier
    .offset(x=135.dp,y = 7.dp)
    .size(15.dp,17.dp))
}

Row(horizontalArrangement = Arrangement.End) {
    Text(text = "Дата и время", fontSize = 20.sp, color = White, fontWeight = FontWeight.Bold, modifier = Modifier.offset(x = 15.dp, y=20.dp))
    Image(painter = painterResource(id = R.drawable.vector),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .offset(x=230.dp,y = 30.dp)
            .size(15.dp, 17.dp))
}
  Row(horizontalArrangement = Arrangement.Center) {
      Text(text = "Настройки звука", fontSize = 20.sp, color = White, fontWeight = FontWeight.Bold, modifier = Modifier.offset(x = 15.dp, y=40.dp))
      Image(painter = painterResource(id = R.drawable.vector),
          contentDescription = null,
          contentScale = ContentScale.Crop,
          modifier = Modifier
              .offset(x=200.dp,y = 50.dp)
              .size(15.dp, 17.dp))
  }
        Row(horizontalArrangement = Arrangement.End) {
            Text(text = "Проверить обновления", fontSize = 20.sp, color = White, fontWeight = FontWeight.Bold, modifier = Modifier.offset(x = 15.dp, y=60.dp))
            Image(painter = painterResource(id = R.drawable.vector),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .offset(x=140.dp,y = 70.dp)
                    .size(15.dp, 17.dp))
        }

    }

}

@Composable
fun BottomPanel4(name: String) {
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
                            .size(40.dp).clickable(onClick =
                            {
                                val intent = Intent(context, GeneralActivity::class.java)
                                ContextCompat.startActivity(context, intent, null)
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
                        painter = painterResource(R.drawable.clock),
                        contentDescription = "Alarm",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable(onClick =
                            {
                                val intent = Intent(context, AlarmActivity::class.java)
                                ContextCompat.startActivity(context, intent, null)
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
                                ContextCompat.startActivity(context, intent, null)
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
                        painter = painterResource(R.drawable.gsettings),
                        contentDescription = "Settings",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable(onClick =
                            {
                                val intent = Intent(context, SettingsActivity::class.java)
                                ContextCompat.startActivity(context, intent, null)
                            })
                    )
                    Text(
                        text = "Settings",
                        color = GreenColor,
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
fun IconView4(name: String){
    val context = LocalContext.current
    Image(
        painter = painterResource(id = R.drawable.avatar),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .offset(x = 150.dp, y = 15.dp)
            .size(60.dp).clickable(onClick={
                val intent = Intent(context, ProfileActivity::class.java)
                startActivity(context,intent, null)})
    )
}

@Composable
fun Greeting3(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    Rabota1Theme {
        Greeting3("Android")
    }
}