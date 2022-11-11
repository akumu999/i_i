package com.bignerdranch.android.rabota1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.bignerdranch.android.rabota1.ui.theme.GreenColor
import com.bignerdranch.android.rabota1.ui.theme.LightGreen
import com.bignerdranch.android.rabota1.ui.theme.Rabota1Theme
import com.bignerdranch.android.rabota1.ui.theme.White

class UserLogin2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Rabota1Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = GreenColor) {
                    Row(modifier = Modifier.offset(x = 20.dp, y = 20.dp)) {
                        GeneralActivity().TextView("Войти")

                    }
                    Row(modifier = Modifier.offset(x = 170.dp, y = 0.dp)) {
                        GeneralActivity().IconView("")
                    }
                    Column() {
                        TextBoxes2()
                    }
                    Column(modifier = Modifier.offset(y=375.dp)) {
                        ButtonAdd9("Войти")
                    }
                }
            }
        }
    }
}

@Composable
fun ButtonAdd9(name: String) {
    val context = LocalContext.current
    Column (modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center)
    ) {
        Button(onClick = {val intent = Intent(context,GeneralActivity::class.java)
            ContextCompat.startActivity(context,intent, null)
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
fun TextBoxes2()
{
    var text by rememberSaveable { mutableStateOf("Имя пользователя") }
    var text3 by rememberSaveable { mutableStateOf("Пароль") }
    Column() {
        TextField(
            value = text,
            onValueChange = {
                text = it
            }, modifier = Modifier
                .offset(x = 30.dp, y = 225.dp)
                .clip((RoundedCornerShape(20)))
                .size(340.dp, 50.dp)
                .background(White)
        )
        TextField(
            value = text3,
            onValueChange = {
                text3 = it
            }, modifier = Modifier
                .offset(x = 30.dp, y = 255.dp)
                .clip((RoundedCornerShape(20)))
                .size(340.dp, 50.dp)
                .background(White)
        )
    }


}

@Composable
fun Greeting10(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview10() {
    Rabota1Theme {
        Greeting10("Android")
    }
}