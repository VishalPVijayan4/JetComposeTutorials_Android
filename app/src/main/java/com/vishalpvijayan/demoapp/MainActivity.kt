package com.vishalpvijayan.demoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingMessage(Greetings("Vishal", "Hope you doing good"))
        }
    }

}

data class Greetings(var authorName : String, var greetingMessage : String)


@Composable
fun GreetingMessage(greetings: Greetings) {
    Row{
        Image(
            painter =
        painterResource(
            id = R.drawable.ic_launcher_foreground),
            contentDescription = "Profile Image",
            modifier = Modifier.size(40.dp).clip(shape = CircleShape)
        )

        Column {
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = greetings.authorName)
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = greetings.greetingMessage)
            Spacer(modifier = Modifier.height(10.dp))
        }

    }


}


@Preview
@Composable
private fun PreviewGreetingMessage(){
    GreetingMessage(Greetings("Lexi","How you doing ?"))
}
