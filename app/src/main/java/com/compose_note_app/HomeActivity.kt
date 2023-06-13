package com.compose_note_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose_note_app.ui.theme.ComposeNoteAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNoteAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SingleNote()
                    //test()
                }
            }
        }
    }
}

@Composable
fun SingleNote() {
    Card(
        modifier = Modifier
            .height(IntrinsicSize.Min)
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Yellow
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(16.dp)
        ) {
            SimpleText(
                modifier = Modifier
                    .fillMaxWidth(),
                str = "How to make your personal brand stand out online!"
            )
            SimpleText(
                modifier = Modifier
                    .padding(top = 10.dp),
                str = "May 22, 2023",
                color = Color.LightGray
            )
        }
    }
}

@Composable
fun SimpleText(modifier: Modifier, str: String, color: Color = Color.Black) {
    Text(
        modifier = modifier,
        text = str,
        color = color,
    )
}

@Composable
fun test() {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        shape = RoundedCornerShape(size = 16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Blue),
        modifier = Modifier
            .size(width = 200.dp, height = 200.dp)
    ) {
    }
}

@Preview(showBackground = true)
@Composable
fun SingleNotePreview() {
    ComposeNoteAppTheme {
        SingleNote()
    }
}