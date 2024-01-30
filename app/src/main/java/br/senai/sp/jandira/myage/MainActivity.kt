package br.senai.sp.jandira.myage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.myage.ui.theme.MyAgeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAgeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Column {
                        MinhaTela()
                        MinhaTela()
                        MinhaTela()
                    }
                }
            }
        }
    }
}

@Composable
fun MinhaTela() {
    Column {
        Text(
            text = "Do you like me? by Daniel Ceasar",
            fontSize = 32.sp,
            color = Color.Blue
        )
        Text(
            text = "Do you like me? by Daniel Ceasar",
            color = Color.Magenta,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Row {
            Button(onClick = { /*TODO*/ }) {
                Column {
                    Text(text = "Honeymoon Avenue")
                    Text(text = "Honeymoon Avenue")
                }
            }
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF65b1E0),
                    contentColor = Color(0xFF000000)
                )
            ) {
                Column {
                    Text(text = "Honeymoon Avenue")
                    Text(text = "Honeymoon Avenue")
                }
            }
        }
    }
}