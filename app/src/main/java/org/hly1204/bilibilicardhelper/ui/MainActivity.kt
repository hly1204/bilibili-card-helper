package org.hly1204.bilibilicardhelper.ui

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
            Text(text = "Hello, Android!")
        }
    }
}

@Composable
private fun bilibiliCardHelper() {
    Text(text = "Hello, Android!")
}

@Preview
@Composable
private fun bilibiliCardHelperPreview() {
    bilibiliCardHelper()
}