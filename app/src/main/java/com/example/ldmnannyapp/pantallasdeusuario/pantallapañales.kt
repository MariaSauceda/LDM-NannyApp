package com.example.ldmnannyapp.pantallasdeusuario

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ldmnannyapp.R
import com.example.ldmnannyapp.R.drawable.pa_albebe
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
            Text(text = "ALIMENTOS",
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
                modifier = modifier.paddingFromBaseline(30.dp),

                )
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