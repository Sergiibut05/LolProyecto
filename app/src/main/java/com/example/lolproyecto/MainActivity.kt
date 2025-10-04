package com.example.lolproyecto


import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.consumeWindowInsets

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.lolproyecto.ui.theme.LolProyectoTheme
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import com.google.gson.Gson
import android.net.Uri
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.TopAppBarColors
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LolProyectoTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {TopAppBar(
                        title = {
                            Box(modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center){
                                Text(text = "⚔\uFE0F Champions App ⚔\uFE0F",
                                    style = MaterialTheme.typography.titleLarge,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFFC79B3B)
                                )
                            }},
                        colors = TopAppBarDefaults.topAppBarColors(
                            containerColor = Color(0xFF0A1428)
                        )
                        )}
                ) {
                        padding ->
                    Column(
                        modifier = Modifier.consumeWindowInsets(padding).padding(padding)
                    ){
                        ChampionApp();
                    }



                }
            }
        }
    }
}



@Composable
fun ChampionApp(){
    var navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "pantalla1"
    ){
        composable("pantalla1"){
            DinamicChampionListItem(navController)
        }
        composable("detalle/{championJson}"){
            backStackEntry ->
                val championJson = backStackEntry.arguments?.getString("championJson")
                val champion = Gson().fromJson(championJson, Champion::class.java)
                ChampionDetails(navController, champion = champion)

        }
    }
}


@Composable
fun ChampionDetails(
    navController: NavController,
    champion: Champion
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()) {

        AsyncImage(
            modifier = Modifier.padding(16.dp).clip(RoundedCornerShape(16.dp)),
            model = champion.splashUrl.toHttpUrlOrNull(),
            contentDescription = "${champion.title} splash"
        )

        Text(
            text = champion.title,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            text = champion.surname,
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(12.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
            ) {
            Column(horizontalAlignment = Alignment.Start,
                modifier = Modifier.padding(horizontal = 16.dp)) {
                Text("Clase: ${champion.clase}")
                Text("Carril: ${champion.carril}")
                Text("Recurso: ${champion.recurso}")
                Text("Lanzamiento: ${champion.lanzamiento}")
            }
            if (champion.imageUrl.isNullOrBlank()){
            Image(
            modifier = Modifier.size(128.dp).padding(horizontal = 16.dp),
            painter = painterResource(champion.image),
            contentDescription = "Champion Image",
            contentScale = ContentScale.Crop
            )
            }else{
            AsyncImage(
            modifier = Modifier.size(128.dp).padding(horizontal = 16.dp),
            model = champion.imageUrl.toHttpUrlOrNull(),
            contentDescription = null
            )
            }
        }



        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = champion.descripcion,
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(8.dp)).background(Color(0xFFF5F5F5)).padding(12.dp)
        ) {
            Text(text = "📰 Estadísticas:", fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(8.dp))

            champion.estadisticas.forEach { estat ->
                Text("• $estat")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))





        Button(onClick = {navController.navigate("pantalla1")}) {
            Text("Volver")
        }
    }
}


@Composable
fun ChampionListItem(
    champion: Champion,
    navController: NavController
){
    val imageModifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp).size(40.dp).clip(CircleShape)
    Row(
        modifier = Modifier.fillMaxWidth().background(Color(0xFF0A1428)),
        verticalAlignment = Alignment.CenterVertically,

    ) {
        if (champion.imageUrl.isNullOrBlank()){
            Image(
                modifier = imageModifier,
                painter = painterResource(champion.image),
                contentDescription = "Champion Image",
                contentScale = ContentScale.Crop
            )
        }else{
            AsyncImage(
                modifier = imageModifier,
                model = champion.imageUrl.toHttpUrlOrNull(),
                contentDescription = null
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column (
                modifier = Modifier.padding(vertical = 8.dp)
            ){
                Text(text=champion.title,
                    style = MaterialTheme.typography.headlineMedium,
                    color = Color.White)
                Text(text=champion.surname,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White)
            }

            IconButton(
                modifier = Modifier.padding(horizontal = 16.dp).clip(CircleShape).background(Color(0xFF785A28)),
                onClick = {
                    var championJson = Uri.encode(Gson().toJson(champion))
                    navController.navigate("detalle/$championJson")
                }){
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = null,
                    tint = Color(0xFFF0E6D2)

                )
            }
        }

        
    }
}

@Composable
fun DinamicChampionListItem(navController: NavController){

    LazyColumn (){
        items(dinamicCHampionList){
            ChampionListItem(it, navController)
        }
    }

}