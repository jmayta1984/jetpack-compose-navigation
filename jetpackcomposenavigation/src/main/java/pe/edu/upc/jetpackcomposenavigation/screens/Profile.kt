package pe.edu.upc.jetpackcomposenavigation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Profile() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column {
            Text(
                text = "Navigation without arguments",
                Modifier.padding(10.dp),
                color = Color.Black
            )
            Text(
                text = "Profile screen",
                Modifier.padding(10.dp)
            )
        }
    }
}
