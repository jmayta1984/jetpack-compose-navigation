package pe.edu.upc.jetpackcomposenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import pe.edu.upc.jetpackcomposenavigation.screens.Home
import pe.edu.upc.jetpackcomposenavigation.screens.Profile
import pe.edu.upc.jetpackcomposenavigation.screens.Settings
import pe.edu.upc.jetpackcomposenavigation.ui.theme.JetpackViewBindingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            JetpackViewBindingTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    ScreenMain()
                }
            }
        }
    }
}


@Composable
fun ScreenMain() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Home.route) {

        // First route: Home
        composable(Routes.Home.route) {
            Home(navController = navController)
        }

        // Without passing arguments: Profile
        composable(Routes.Profile.route) {
            Profile()
        }

        // Passing arguments: Settings
        composable(Routes.Settings.route + "/{id}") { navBackStackEntry ->

            val counter = navBackStackEntry.arguments?.getString("id")

            Settings(counter = counter)

        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackViewBindingTheme {

    }
}