package com.example.ldmnannyapp.pantallasdeusuario

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ldmnannyapp.R
import com.example.ldmnannyapp.R.drawable.pa_albebe
import com.example.ldmnannyapp.ui.theme.LDMNannyAppTheme
import com.example.ldmnannyapp.ui.theme.amarillito

class Formulario : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LDMNannyAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    vistaCambioPanal()
                }
            }
        }
    }
}

@Composable
fun vistaCambioPanal() {
    val scrollState = rememberScrollState()//scroll en toda la pantalla
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.verticalScroll(scrollState),//scroll en la pantalla
    ) {
        topBar()
        Spacer(Modifier.padding(5.dp))
        title()
        Spacer(Modifier.padding(5.dp))
        title2()
        Spacer(Modifier.padding(5.dp))
        ColorHeces()
        Spacer(Modifier.padding(5.dp))
        BotonGuardar()
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
            Image(painter = painterResource(id = pa_albebe),
            //val image1 = painterResource(id = R.drawable.),
                contentDescription = null,
                modifier = Modifier
                    .paddingFromBaseline(7.dp, 0.dp)

                    .size(35.dp))
            Text(text = "CAMBIO PAÑAL",
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
                modifier = modifier.paddingFromBaseline(30.dp),
            )
        }
    }
}

@Composable
fun title2(){
    Text(
        text = "Detalles importantes",
        textAlign = TextAlign.Center,
        fontSize = 24.sp
        //color = Color.letra
    )
}

@Composable
fun ColorHeces(){
    val radioOptions = listOf("Negro-Verdoso", "Cafe-Verdoso", "Amarillo mostaza", "Verde-Brillante", "Blanco",
    "Cafe-Claro", "Rojo-Rosaceo", "Cafe", "Verde-Oscuro", "Negro")
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[0]) }
    //Otra lista
    val radioOptions2 = listOf("Pegajoso", "Grueso","Seco","Blanda","Granuloso","Acuoso","Con manchas rojas")
    val (selectedOption2, onOptionSelected2) = remember { mutableStateOf(radioOptions2[0]) }
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            "Color de las heces fecales",
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(8.dp)
        )
        Column {
            radioOptions.forEach { text ->
                Row(
                    Modifier
                        .fillMaxWidth()
                        .selectable(
                            selected = (text == selectedOption),
                            onClick = { onOptionSelected(text) }
                        )
                    //.padding(horizontal = 16.dp)//16
                ) {
                    val context = LocalContext.current
                    RadioButton(
                        selected = (text == selectedOption), //modifier = Modifier.padding(all = Dp(value = 8F))
                        onClick = {
                            onOptionSelected(text)
                            Toast.makeText(context, text, Toast.LENGTH_LONG).show()
                        }
                    )
                    Text(
                        text = text,
                        modifier = Modifier.padding(start = 8.dp)//16
                    )
                }
            }
        }
        //Aqui va la otra lista 2
        Text("______________________________________________",
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
                .fillMaxHeight()
                .padding(start = 5.dp, end = 5.dp)
        )
        Text(
            "Consistencia de las heces fecales",
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(8.dp)
        )
        Column {
            radioOptions2.forEach { text ->
                Row(
                    Modifier
                        .fillMaxWidth()
                        .selectable(
                            selected = (text == selectedOption2),
                            onClick = { onOptionSelected2(text) }
                        )
                    //.padding(horizontal = 16.dp)//16
                ) {
                    val context = LocalContext.current
                    RadioButton(
                        selected = (text == selectedOption2), //modifier = Modifier.padding(all = Dp(value = 8F))
                        onClick = {
                            onOptionSelected2(text)
                            Toast.makeText(context, text, Toast.LENGTH_LONG).show()
                        }
                    )
                    Text(
                        text = text,
                        modifier = Modifier.padding(start = 8.dp)//16
                    )
                }
            }
        }
    }
}

@Composable
fun BotonGuardar(){
    Row(horizontalArrangement = Arrangement.End,
        modifier = Modifier.fillMaxWidth().fillMaxHeight()
    //.padding(end = 15.dp, top = 5.dp, bottom = 5.dp, start = 15.dp)
    ){
        Button(
            modifier = Modifier.padding(end = 35.dp, top = 10.dp, bottom = 10.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Magenta),
            onClick = { /*TODO*/ }) {
            Text(text = "Guardar")
        }

    }
}

//No se esta usando
@Composable
fun Separador(){
    Column(){
        Text("-------------------------------------")
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    LDMNannyAppTheme {
        vistaCambioPanal()
    }
}