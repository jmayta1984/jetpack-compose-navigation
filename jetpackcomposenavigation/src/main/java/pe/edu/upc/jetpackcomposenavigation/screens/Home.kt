package pe.edu.upc.jetpackcomposenavigation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController
import pe.edu.upc.jetpackcomposenavigation.Routes

@Composable
fun Home(navController: NavController) {

    var counter by remember {
        mutableStateOf(0)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White), contentAlignment = Alignment.Center
    ) {

        Column {
            Text(text = "Home, counter is $counter")
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {counter++}){
                Text(text="Increment counter")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {
                navController.navigate(Routes.Profile.route)
            }) {
                Text(text = "Navigate to profile")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {
                navController.navigate(Routes.Settings.route+"/$counter")
            }) {
                Text(text = "Navigate to settings")
            }
        }
    }


}