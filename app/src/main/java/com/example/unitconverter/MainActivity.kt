package com.example.unitconverter

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    UnitConverter()
                }
            }
        }
    }
}

@Composable
fun UnitConverter() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // All UI elements will be stacked here below each other
//        Greeting(name = "Android")
//        Greeting(name = "Android")
        Text("Unit Converter")
        OutlinedTextField(value = "", onValueChange = {} )
        
        Row {
//            val context = LocalContext.current
            // All UI elements will be stacked here next to each other
            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")
                }
            }
            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")
                }
            }
        }
        Text("Result:")
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

@Preview(showBackground = true)
@Composable
fun UnitConverterPreview() {
    UnitConverter()
}