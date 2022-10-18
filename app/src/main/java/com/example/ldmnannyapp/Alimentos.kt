package com.example.ldmnannyapp

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.ldmnannyapp.ui.theme.*

class Otros : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LDMNannyAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    vistaOtros()
                }
            }
        }
    }
}

@Composable
fun vistaOtros() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        topBarOtros()
        Spacer(Modifier.height(15.dp))
        titleOtros()
        Spacer(Modifier.height(15.dp))
        regOtros()
        Spacer(Modifier.height(30.dp))
        estOtros()
    }

}

@Composable
fun topBarOtros()
{
    TopAppBar()
    {
        Text("Mariana",
            textAlign = TextAlign.Center,
            color = letra,
            fontWeight = FontWeight.Bold,
            fontFamily = MeriendaOne,
            fontSize = 30.sp,
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}

@Composable
fun titleOtros(modifier: Modifier = Modifier)
{
    Card(
        modifier = Modifier
            .size(250.dp, 65.dp)
            .padding(9.dp)
            .clip(RoundedCornerShape(25))
    )
    {
        Row(horizontalArrangement = Arrangement.Center){
            Image(painter = painterResource(id = R.drawable.otro),
                contentDescription = null,
                modifier = Modifier
                    .paddingFromBaseline(7.dp, 0.dp)
                    .size(35.dp))
            Spacer(Modifier.width(10.dp))
            Text("Otros",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = ConcertOne,
                color = letra,
                modifier = modifier.paddingFromBaseline(32.dp,0.dp),
            )
        }
    }
}

@Composable
fun regOtros() {
    Scaffold(Modifier.size(300.dp,165.dp), backgroundColor = amarillito) {
        Column() {
            Spacer(Modifier.height(10.dp))
            Text(text = "Últimos registros",
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                fontFamily = ConcertOne,
                color = letra,
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(Modifier.height(10.dp))
            Row() {
                Text("1",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .width(100.dp)
                        .height(40.dp)
                        .paddingFromBaseline(27.dp),
                    fontFamily = SpaceMono,
                    fontWeight = FontWeight.Normal
                )
                Text("2",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .width(100.dp)
                        .height(40.dp)
                        .paddingFromBaseline(27.dp),
                    fontFamily = SpaceMono,
                    fontWeight = FontWeight.Normal
                )
                Text("3",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .width(100.dp)
                        .height(40.dp)
                        .paddingFromBaseline(27.dp),
                    fontFamily = SpaceMono,
                    fontWeight = FontWeight.Normal
                )
            }

            Row() {
                Text("4",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .width(100.dp)
                        .height(40.dp)
                        .paddingFromBaseline(27.dp),
                    fontFamily = SpaceMono,
                    fontWeight = FontWeight.Normal
                )
                Text("5",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .width(100.dp)
                        .height(40.dp)
                        .paddingFromBaseline(27.dp),
                    fontFamily = SpaceMono,
                    fontWeight = FontWeight.Normal
                )
                Text("6",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .width(100.dp)
                        .height(40.dp)
                        .paddingFromBaseline(27.dp),
                    fontFamily = SpaceMono,
                    fontWeight = FontWeight.Normal
                )
            }
            Row() {
                Text("7",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .width(100.dp)
                        .height(40.dp)
                        .paddingFromBaseline(27.dp),
                    fontFamily = SpaceMono,
                    fontWeight = FontWeight.Normal
                )
                Text("8",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .width(100.dp)
                        .height(40.dp)
                        .paddingFromBaseline(27.dp),
                    fontFamily = SpaceMono,
                    fontWeight = FontWeight.Normal
                )
                Text("9",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .width(100.dp)
                        .height(40.dp)
                        .paddingFromBaseline(27.dp),
                    fontFamily = SpaceMono,
                    fontWeight = FontWeight.Normal
                )
            }
        }
    }
}

@Composable
fun estOtros(){
    Scaffold(Modifier.size(300.dp, 150.dp), backgroundColor = amarillito) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Spacer(Modifier.height(15.dp))
            Text("Estadísticas",
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                fontFamily = ConcertOne,
                color = letra,
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(Modifier.height(15.dp))
            Text("Tu bebé tomó medicina X veces al día.",
                textAlign = TextAlign.Center,
                fontFamily = SpaceMono,
                fontWeight = FontWeight.Normal,
                fontSize = 13.sp,
            )
            Spacer(Modifier.height(8.dp))
            Text("Tu bebé tomó vitaminas X veces al día.",
                fontFamily = SpaceMono,
                fontWeight = FontWeight.Normal,
                fontSize = 13.sp,
                textAlign = TextAlign.Center
            )
            Spacer(Modifier.height(8.dp))
            Text("Tu bebé hizo Y cosa X veces al día.",
                fontFamily = SpaceMono,
                fontWeight = FontWeight.Normal,
                fontSize = 13.sp,
                textAlign = TextAlign.Center
            )
            Spacer(Modifier.height(8.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAlmentos() {
    LDMNannyAppTheme {
        vistaOtros()
    }
}