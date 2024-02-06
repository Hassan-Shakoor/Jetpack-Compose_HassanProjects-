package com.hassan.movieapp.screens.home

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.hassan.movieapp.MovieRow
import com.hassan.movieapp.navigation.MovieScreens

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Color.Transparent,//MaterialTheme.colorScheme.primaryContainer,
            //titleContentColor = MaterialTheme.colorScheme.primary,
        ),
            title = { Text(text = "Movie App Bar") },
            modifier = Modifier.shadow(2.dp)
        )
    },) { innerPadding ->
        MainContent(navController = navController, innerPadding)
    }
}

@Composable
fun MainContent (navController: NavController, padding: PaddingValues, movieList: List<String> = listOf(
    "Avatar", "300" ,"Harry Potter", "Life," +
            "Pursuit of Happiness", "3 Idiots",
            "Prince of Persia",
            "Man of Steel"
)) {
    Column(modifier = Modifier.padding(padding)) {
        LazyColumn {
            items(items = movieList) {
                MovieRow(movie = it) { movie ->
                    navController.navigate(route = MovieScreens.DetailsScreen.name+"/$movie")
                    Log.d("MOVIE", "movie: $movie")
                }
            }
        }
    }
}