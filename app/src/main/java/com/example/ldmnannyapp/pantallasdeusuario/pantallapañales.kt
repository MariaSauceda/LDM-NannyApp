package com.example.ldmnannyapp.pantallasdeusuario

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        topBar()
        Spacer(Modifier.padding(5.dp))
        title()
        Spacer(Modifier.padding(5.dp))
        title2()
        Spacer(Modifier.padding(5.dp))
        ColorHeces()
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
    val radioOptions = listOf("DSA", "Java", "C++")
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[2]) }
    Column(
        // we are using column to align our
        // imageview to center of the screen.
        modifier = Modifier.fillMaxWidth().fillMaxHeight(),

        // below line is used for
        // specifying vertical arrangement.
        verticalArrangement = Arrangement.Center,

        // below line is used for
        // specifying horizontal arrangement.
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        // we are displaying all our
        // radio buttons in column.
        Column {
            // below line is use to set data to
            // each radio button in columns.
            radioOptions.forEach { text ->
                Row(
                    Modifier
                        // using modifier to add max
                        // width to our radio button.
                        .fillMaxWidth()
                        // below method is use to add
                        // selectable to our radio button.
                        .selectable(
                            // this method is called when
                            // radio button is selected.
                            selected = (text == selectedOption),
                            // below method is called on
                            // clicking of radio button.
                            onClick = { onOptionSelected(text) }
                        )
                        // below line is use to add
                        // padding to radio button.
                        .padding(horizontal = 16.dp)
                ) {
                    // below line is use to get context.
                    val context = ContextAmbient.current

                    // below line is use to
                    // generate radio button
                    RadioButton(
                        // inside this method we are
                        // adding selected with a option.
                        selected = (text == selectedOption),modifier = Modifier.padding(all = Dp(value = 8F)),
                        onClick = {
                            // inside on click method we are setting a
                            // selected option of our radio buttons.
                            onOptionSelected(text)

                            // after clicking a radio button
                            // we are displaying a toast message.
                            Toast.makeText(context, text, Toast.LENGTH_LONG).show()
                        }
                    )
                    // below line is use to add
                    // text to our radio buttons.
                    Text(
                        text = text,
                        modifier = Modifier.padding(start = 16.dp)
                    )
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Preview() {
    LDMNannyAppTheme {
        vistaCambioPanal()
    }
}