package com.example.musicappui.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicappui.R

@Composable
fun AccountView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row {
                Icon(
                    modifier = Modifier.padding(end = 8.dp),
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = null
                )
                Column {
                    Text(text = "PanjuTutorials")
                    Text(text = "@tutorialsEu")
                }
            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = null)
            }
        }
        
        Row(modifier = Modifier.padding(top = 16.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_music_video_24),
                contentDescription = null,
                modifier = Modifier.padding(end = 8.dp)
            )
            Text(text = "My Music")
        }
        HorizontalDivider()
    }
}