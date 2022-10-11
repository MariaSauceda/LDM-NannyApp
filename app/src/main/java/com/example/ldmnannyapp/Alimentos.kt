package com.example.ldmnannyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ldmnannyapp.ui.theme.LDMNannyAppTheme
import com.example.ldmnannyapp.ui.theme.amarillito

class Alimentos : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LDMNannyAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    vistaAlimentos()
                }
            }
        }
    }
}

@Composable
fun vistaAlimentos() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        topBar()
        Spacer(Modifier.padding(5.dp))
        title()
        Spacer(Modifier.padding(5.dp))
        reg()
    }

}

@Composable
fun topBar()
{
    TopAppBar()
    {
    }
}

@Composable
fun title(modifier: Modifier = Modifier)
{
    Card(
        modifier = Modifier
            .size(250.dp, 65.dp)
            .padding(9.dp)
            .clip(RoundedCornerShape(25))
    )
    {
        Row(horizontalArrangement = Arrangement.Center){
            Image(painter = painterResource(id = R.drawable.biberon),
                contentDescription = null,
                modifier = Modifier
                    .paddingFromBaseline(7.dp, 0.dp)
                    .size(35.dp))
            Text(text = "ALIMENTOS",
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
                modifier = modifier.paddingFromBaseline(30.dp),

            )
        }

    }
}

@Composable
fun reg() {
    Scaffold(Modifier.size(300.dp, 200.dp), backgroundColor = amarillito) {
        Column() {
            Text(text = "Últimos registros")
            Spacer(Modifier.size(10.dp))
            Row(horizontalArrangement = Arrangement.Center) {
                Text(text = "1", modifier = Modifier.size(50.dp, 50.dp))
                Text(text = "2", modifier = Modifier.size(50.dp, 50.dp))
                Text(text = "3", modifier = Modifier.size(50.dp, 50.dp))
            }

            Row() {
                Text(text = "4", modifier = Modifier.size(50.dp, 50.dp))
                Text(text = "5", modifier = Modifier.size(50.dp, 50.dp))
                Text(text = "6", modifier = Modifier.size(50.dp, 50.dp))
            }
            Row() {
                Text(text = "7", modifier = Modifier.size(50.dp, 50.dp))
                Text(text = "8", modifier = Modifier.size(50.dp, 50.dp))
                Text(text = "9", modifier = Modifier.size(50.dp, 50.dp))
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Preview() {
    LDMNannyAppTheme {
        vistaAlimentos()
    }
}