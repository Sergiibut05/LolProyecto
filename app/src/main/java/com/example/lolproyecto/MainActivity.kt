package com.example.lolproyecto


import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
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

import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.lolproyecto.ui.theme.LolProyectoTheme
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull


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
                        title = { Text("Champions App") },
                        )}
                ) {
                        padding ->
                    Column(
                        modifier = Modifier.consumeWindowInsets(padding).padding(padding)
                    ){
                        DinamicChampionListItem();
                    }



                }
            }
        }
    }
}

data class Champion( val image: Int = 0, val title: String, val description: String, val imageUrl: String? = null)

@Composable
fun ChampionListItem(
    champion: Champion
){
    val imageModifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp).size(40.dp).clip(CircleShape)
    Row(
        modifier = Modifier.fillMaxWidth().background(color = Color.LightGray),
        verticalAlignment = Alignment.CenterVertically
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
        Column (
            modifier = Modifier.padding(vertical = 8.dp)
        ){
            Text(text=champion.title,
                style = MaterialTheme.typography.headlineMedium)
            Text(text=champion.description,
                style = MaterialTheme.typography.bodyMedium)
        }
        
    }
}

@Composable
fun DinamicChampionListItem(){
    val dinamicCHampionList: List<Champion> = listOf(

        Champion(image = R.drawable.diana,title = "Diana", description = "El Desdén de la Luna"),
        Champion(image = R.drawable.fizz,title = "Fizz", description = "El Bromista de las Mareas"),
        Champion(image = R.drawable.irelia,title = "Irelia", description = "La Bailarina de las Cuchillas"),
        Champion(image = R.drawable.leona,title = "Leona", description = "El Amanecer Radiante"),
        Champion(image = R.drawable.mordekaiser,title = "Mordekaiser", description = "La Pesadilla de Hierro"),
        Champion(image = R.drawable.neeko,title = "Neeko", description = "La Camaleona Curiosa"),
        Champion(image = R.drawable.senna,title = "Senna", description = "La Redentora"),
        Champion(image = R.drawable.taric,title = "Taric", description = "El Escudo de Valoran"),
        Champion(image = R.drawable.teemo,title = "Teemo", description = "El Explorador Veloz"),
        Champion(image = R.drawable.vi,title = "Vi", description = "Los Puños de Hierro"),
        Champion(image = R.drawable.ziggs,title = "Ziggs", description = "El Yordle Explosivo"),
        //Campeones con URL
        Champion(image = 5, title = "Annie", description = "Hija de la Oscuridad", imageUrl = "https://static.wikia.nocookie.net/lolesports_gamepedia_en/images/6/6f/AnnieSquare.png/revision/latest?cb=20170728174743"),
        Champion(imageUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/1/15/Aatrox_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20180612203801", title = "Aatrox", description = "La Espada Oscura" ),
        Champion(imageUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/2/2a/Ahri_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20230201172235", title = "Ahri", description = "El zorro de nueve colas"),
        Champion(imageUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/a/ad/Yasuo_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20150402222545", title = "Yasuo", description = "El Imperdonable"),
        Champion(imageUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/6/65/Jinx_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20160417011945", title = "Jinx", description = "El Gatillo Suelto"),
        Champion(imageUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/c/c3/Thresh_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20150402221302", title = "Thresh", description = "El Carcelero Implacable"),
        Champion(imageUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/5/5f/Ekko_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20151218185247", title = "Ekko", description = "El Chico que Fragmentó el Tiempo"),
        Champion(imageUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/3/31/Samira_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20200829040527", title = "Samira", description = "El Desierto Salvaje"),
        Champion(imageUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/d/da/Sett_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20200119095456", title = "Sett", description = "El Jefe"),
        Champion(imageUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/0/06/Vex_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20231116224716", title = "Vex", description = "La Tristeza Encarnada"),
        Champion(imageUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/4/46/Zed_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20160526214523", title = "Zed", description = "El Maestro de las Sombras"),
        Champion(imageUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/b/bf/Lux_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20150402220552", title = "Lux", description = "La Dama de la Luz"),
        Champion(imageUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/c/c9/Kayn_OriginalSquare.png/revision/latest/scale-to-width-down/42?cb=20170628021945", title = "Kayn", description = "El Segador Sombrío"))
    LazyColumn (){
        items(dinamicCHampionList){
            ChampionListItem(it)
        }
    }

}