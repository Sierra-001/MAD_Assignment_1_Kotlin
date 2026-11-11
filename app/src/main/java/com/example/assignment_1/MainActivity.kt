package com.example.assignment_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.assignment_1.ui.theme.Assignment_1Theme
import com.example.assignment_1.ui.theme.MutedOlive
import com.example.assignment_1.ui.theme.OffWhite

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment_1Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    FieldProtocolScreen()
                }
            }
        }
    }
}

@Composable
fun FieldProtocolScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        ProtocolHeader()
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            contentPadding = PaddingValues(horizontal = 20.dp, vertical = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(fieldProtocolTips) { tip ->
                TipCard(tip = tip)
            }
        }
    }
}

@Composable
private fun ProtocolHeader() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 20.dp)
    ) {
        Text(
            text = "FIELD PROTOCOL",
            style = MaterialTheme.typography.headlineMedium,
            color = OffWhite
        )
        Text(
            text = "7-DAY TACTICAL DIRECTIVE",
            style = MaterialTheme.typography.labelSmall,
            color = MutedOlive
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FieldProtocolPreview() {
    Assignment_1Theme {
        FieldProtocolScreen()
    }
}