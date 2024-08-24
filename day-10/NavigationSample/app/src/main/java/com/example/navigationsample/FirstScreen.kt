package com.example.navigationsample

import android.content.Context
import android.widget.Toast
import androidx.collection.emptyIntSet
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun FirstScreen(navigationToSecondScreen:(String, Int)->Unit) {
    val name = remember {
        mutableStateOf("")
    }

    val age = remember {
        mutableStateOf(0)
    }

    val context = LocalContext.current


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "This is the First Screen", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Name:")
        OutlinedTextField(
            textStyle = TextStyle(textAlign = TextAlign.Center),

            value = name.value, onValueChange = {
            name.value = it
        })
        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Age:")
        OutlinedTextField(textStyle = TextStyle(textAlign = TextAlign.Center), value = age.value.toString(), onValueChange = {
            age.value = Integer.parseInt(it)
        })
        Button(onClick = {
            if (name.value.isNotEmpty()) {
                navigationToSecondScreen(name.value, age.value)
            } else {
                Toast.makeText(context, "Preencha o campo", Toast.LENGTH_SHORT).show()
            }
        }) {
            Text(text = "Go to Second Screen")
        }
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewFirstScreen() {
    FirstScreen(navigationToSecondScreen = {
        name: String,
        age: Int ->

    })
}