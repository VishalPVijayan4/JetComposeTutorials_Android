package com.vishalpvijayan.demoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            greetingMessage("Vishal")
        }
    }

}


@Composable
fun greetingMessage(s: String) {
    Text(text = "$s, How are you ?")
}


@Preview
@Composable
private fun previewGreetingMessage(){
    greetingMessage("Vishal")
}
