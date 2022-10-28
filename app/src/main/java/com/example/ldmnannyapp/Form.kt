package com.example.ldmnannyapp

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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ldmnannyapp.ui.theme.ConcertOne
import com.example.ldmnannyapp.ui.theme.LDMNannyAppTheme
import com.example.ldmnannyapp.ui.theme.letra

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
        Comida()
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
            Image(painter = painterResource(id = R.drawable.biberon),
                contentDescription = null,
                modifier = Modifier
                    .paddingFromBaseline(7.dp, 0.dp)
                    .size(35.dp))
            Spacer(Modifier.width(10.dp))
            Text("ALIMENTOS",
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
fun title2(){
    Text(
        text = "Detalles importantes",
        textAlign = TextAlign.Center,
        fontSize = 24.sp,
        //color = Color.letra
    )
}

@Composable
fun Comida(
){
    val radioOptions = listOf("Leche", "Papilla")
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[0]) }
    //Otra lista
    val radioOptions2 = listOf("Leche materna", "Leche de fórmula")
    val (selectedOption2, onOptionSelected2) = remember { mutableStateOf(radioOptions2[0]) }
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            "¿Qué comió tu bebé?",
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
        Divider(color = Color.Black,
            thickness = 1.dp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
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
        Divider(color = Color.Black,
            thickness = 1.dp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
        )
        Text("¿Qué cantidad comió?",
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Composable
fun BotonGuardar(){
    Row(horizontalArrangement = Arrangement.End,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
        //.padding(end = 15.dp, top = 5.dp, bottom = 5.dp, start = 15.dp)
    ){
        Button(
            modifier = Modifier.padding(end = 35.dp, top = 10.dp, bottom = 10.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Magenta),
            onClick = { /*TODO*/ }) {
            Text("Guardar")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewForm() {
    LDMNannyAppTheme {
        vistaCambioPanal()
    }
}