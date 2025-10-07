package com.example.lolproyecto

data class Champion(
    val id: Long,
    val image: Int = 0,
    val title: String,
    val surname: String,
    val imageUrl: String? = null,
    val lanzamiento: String,
    val clase: String,
    val carril: String,
    val recurso: String,
    val estadisticas: List<String>,
    val descripcion: String,
    val splashUrl: String
)


val dinamicChampionList: List<Champion> = listOf(
    Champion(
        id = 1,
        image = R.drawable.diana,
        title = "Diana",
        surname = "El Desdén de la Luna",
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Diana_OriginalSquare.png",
        lanzamiento = "2012-12-07",
        clase = "Luchadora / Mágico",
        carril = "Jungla / Mid",
        recurso = "Maná",
        estadisticas = listOf(
            "❤️ Vida: 640.00",
            "💧 Reg. vida (5s): 6.50",
            "🛡️ Armadura: 31.00",
            "🔮 Res. mágica: 32.00",
            "🔋 Maná: 375.00",
            "✨ Reg. maná (5s): 8.00",
            "⚔️ Daño de ataque: 57.00",
            "💨 Vel. de ataque: 0.625"
        ),
        descripcion = "La luna guía su furia: maga de daño en área y burst.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/8/86/Aspecto_centrado_-_Diana_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113041127&path-prefix=es"
    ),

    Champion(
        id = 2,
        image = R.drawable.fizz,
        title = "Fizz",
        surname = "El Bromista de las Mareas",
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Fizz_OriginalSquare.png",
        lanzamiento = "2011-05-01",
        clase = "Asesino",
        carril = "Mid / Top / Jungla",
        recurso = "Maná",
        estadisticas = listOf(
            "❤️ Vida: 569.00",
            "💧 Reg. vida (5s): 7.00",
            "🛡️ Armadura: 24.00",
            "🔮 Res. mágica: 32.00",
            "🔋 Maná: 265.00",
            "✨ Reg. maná (5s): 7.00",
            "⚔️ Daño de ataque: 60.00",
            "💨 Vel. de ataque: 0.625"
        ),
        descripcion = "Asesino móvil y explosivo con saltos y control de objetivos.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/f/f3/Aspecto_centrado_-_Fizz_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113040205&path-prefix=es"
    ),

    Champion(
        id = 3,
        image = R.drawable.irelia,
        title = "Irelia",
        surname = "La Bailarina de las Cuchillas",
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Irelia_OriginalSquare.png",
        lanzamiento = "2010-11-16",
        clase = "Luchadora",
        carril = "Top / Mid",
        recurso = "Maná",
        estadisticas = listOf(
            "❤️ Vida: 590.00",
            "💧 Reg. vida (5s): 8.50",
            "🛡️ Armadura: 36.00",
            "🔮 Res. mágica: 30.00",
            "🔋 Maná: 350.00",
            "✨ Reg. maná (5s): 8.00",
            "⚔️ Daño de ataque: 65.00",
            "💨 Vel. de ataque: 0.656"
        ),
        descripcion = "Gran movilidad y duelista con daño sostenido.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/2/25/Aspecto_centrado_-_Irelia_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113032819&path-prefix=es"
    ),

    Champion(
        id = 4,
        image = R.drawable.leona,
        title = "Leona",
        surname = "El Amanecer Radiante",
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Leona_OriginalSquare.png",
        lanzamiento = "2011-07-13",
        clase = "Tanque / Soporte",
        carril = "Soporte",
        recurso = "Maná",
        estadisticas = listOf(
            "❤️ Vida: 646.00",
            "💧 Reg. vida (5s): 13.41",
            "🛡️ Armadura: 74.72",
            "🔮 Res. mágica: 43.84",
            "🔋 Maná: 533.00",
            "✨ Reg. maná (5s): 10.62",
            "⚔️ Daño de ataque: 77.33",
            "💨 Vel. de ataque: 0.747"
        ),
        descripcion = "Soporte tanque con mucho control y engage.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/8/84/Aspecto_centrado_-_Leona_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113035349&path-prefix=es"
    ),

    Champion(
        id = 5,
        image = R.drawable.mordekaiser,
        title = "Mordekaiser",
        surname = "La Pesadilla de Hierro",
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Mordekaiser_OriginalSquare.png",
        lanzamiento = "2010-06-24",
        clase = "Luchador / Mago",
        carril = "Top",
        recurso = "— (sin maná)",
        estadisticas = listOf(
            "❤️ Vida: 645.00",
            "💧 Reg. vida (5s): 5.00",
            "🛡️ Armadura: 37.00",
            "🔮 Res. mágica: 32.00",
            "⚔️ Daño de ataque: 61.00",
            "💨 Vel. de ataque: 0.625"
        ),
        descripcion = "Alta presencia en peleas 1v1 y daño mágico sostenido.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/b/b0/Aspecto_centrado_-_Mordekaiser_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113035006&path-prefix=es"
    ),

    Champion(
        id = 6,
        image = R.drawable.neeko,
        title = "Neeko",
        surname = "La Camaleona Curiosa",
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Neeko_OriginalSquare.png",
        lanzamiento = "2018-12-05",
        clase = "Mago / Soporte",
        carril = "Mid / Support",
        recurso = "Maná",
        estadisticas = listOf(
            "❤️ Vida: 610.00",
            "💧 Reg. vida (5s): 7.50",
            "🛡️ Armadura: 21.00",
            "🔮 Res. mágica: 30.00",
            "🔋 Maná: 450.00",
            "✨ Reg. maná (5s): 7.00",
            "⚔️ Daño de ataque: 48.00",
            "💨 Vel. de ataque: 0.625"
        ),
        descripcion = "Mago con engaños y CC en área.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/c/c3/Aspecto_centrado_-_Neeko_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113043440&path-prefix=es"
    ),

    Champion(
        id = 7,
        image = R.drawable.senna,
        title = "Senna",
        surname = "La Redentora",
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Senna_OriginalSquare.png",
        lanzamiento = "2019-11-10",
        clase = "Tirador / Soporte",
        carril = "Support / ADC",
        recurso = "Maná",
        estadisticas = listOf(
            "❤️ Vida: 530.00",
            "💧 Reg. vida (5s): 3.50",
            "🛡️ Armadura: 28.00",
            "🔮 Res. mágica: 30.00",
            "🔋 Maná: 350.00",
            "✨ Reg. maná (5s): 11.50",
            "⚔️ Daño de ataque: 50.00",
            "💨 Vel. de ataque: 0.625"
        ),
        descripcion = "Soporte/tirador con alcance y utilidad a distancia.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/b/b6/Aspecto_centrado_-_Senna_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113042229&path-prefix=es"
    ),

    Champion(
        id = 8,
        image = R.drawable.taric,
        title = "Taric",
        surname = "El Escudo de Valoran",
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Taric_OriginalSquare.png",
        lanzamiento = "2011-08-31",
        clase = "Soporte / Tanque",
        carril = "Soporte",
        recurso = "Maná",
        estadisticas = listOf(
            "❤️ Vida: 645.00",
            "💧 Reg. vida (5s): 6.00",
            "🛡️ Armadura: 40.00",
            "🔮 Res. mágica: 28.00",
            "🔋 Maná: 300.00",
            "✨ Reg. maná (5s): 8.50",
            "⚔️ Daño de ataque: 55.00",
            "💨 Vel. de ataque: 0.625"
        ),
        descripcion = "Soporte resistente con curas/escudos y control.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/c/c2/Aspecto_centrado_-_Taric_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113033132&path-prefix=es"
    ),

    Champion(
        id = 9,
        image = R.drawable.teemo,
        title = "Teemo",
        surname = "El Explorador Veloz",
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Teemo_OriginalSquare.png",
        lanzamiento = "2009-02-21",
        clase = "Tirador / Mago",
        carril = "Top / Support / Mid (pick raro)",
        recurso = "Maná",
        estadisticas = listOf(
            "❤️ Vida: 598.00",
            "💧 Reg. vida (5s): 5.50",
            "🛡️ Armadura: 24.00",
            "🔮 Res. mágica: 30.00",
            "🔋 Maná: 334.00",
            "✨ Reg. maná (5s): 9.60",
            "⚔️ Daño de ataque: 54.00",
            "💨 Vel. de ataque: 0.690"
        ),
        descripcion = "Hostigador a distancia con trampas (hongos).",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/4/4c/Aspecto_centrado_-_Teemo_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113031426&path-prefix=es"
    ),

    Champion(
        id = 10,
        image = R.drawable.vi,
        title = "Vi",
        surname = "Los Puños de Hierro",
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Vi_OriginalSquare.png",
        lanzamiento = "2012-12-07",
        clase = "Luchadora / Asesina",
        carril = "Jungla / Top",
        recurso = "Maná",
        estadisticas = listOf(
            "❤️ Vida: 1046.05", // snippet shows at level 6 but keeping a typical base; adjust if prefieres exact level1  value
            "💧 Reg. vida (5s): 15.78",
            "🛡️ Armadura: 57.14",
            "🔮 Res. mágica: 43.84",
            "🔋 Maná: 670.38",
            "✨ Reg. maná (5s): 11.75",
            "⚔️ Daño de ataque: 80.33",
            "💨 Vel. de ataque: 0.684"
        ),
        descripcion = "Jungler/pelea 1v1 con gran engage y punch.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/1/12/Aspecto_centrado_-_Vi_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113042540&path-prefix=es"
    ),

    Champion(
        id = 11,
        image = R.drawable.ziggs,
        title = "Ziggs",
        surname = "El Yordle Explosivo",
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Ziggs_OriginalSquare.png",
        lanzamiento = "2012-02-01",
        clase = "Mago",
        carril = "Mid / ADC (AP)",
        recurso = "Maná",
        estadisticas = listOf(
            "❤️ Vida: 606.00",
            "💧 Reg. vida (5s): 6.50",
            "🛡️ Armadura: 21.00",
            "🔮 Res. mágica: 30.00",
            "🔋 Maná: 480.00",
            "✨ Reg. maná (5s): 8.00",
            "⚔️ Daño de ataque: 55.00",
            "💨 Vel. de ataque: 0.656"
        ),
        descripcion = "Mago de poke y limpieza con explosivos de largo alcance.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/6/6d/Aspecto_centrado_-_Ziggs_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113040649&path-prefix=es"
    ),

    // Campeones con URL ya existentes (añado campos extra)
    Champion(
        id = 12,
        title = "Annie",
        surname = "Hija de la Oscuridad",
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Annie_OriginalSquare.png",
        lanzamiento = "2009-02-21",
        clase = "Maga",
        carril = "Mid / Support",
        recurso = "Maná",
        estadisticas = listOf(
            "❤️ Vida: 560.00",
            "💧 Reg. vida (5s): 5.50",
            "🛡️ Armadura: 20.00",
            "🔮 Res. mágica: 30.00",
            "🔋 Maná: 418.00",
            "✨ Reg. maná (5s): 8.00",
            "⚔️ Daño de ataque: 50.41",
            "💨 Vel. de ataque: 0.8"
        ),
        descripcion = "Maga de burst con stun por carga.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/a/ab/Aspecto_centrado_-_Annie_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113030435&path-prefix=es"
    ),

    Champion(
        id = 13,
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Aatrox_OriginalSquare.png",
        title = "Aatrox",
        surname = "La Espada Oscura",
        lanzamiento = "2013-06-13",
        clase = "Luchador",
        carril = "Top",
        recurso = "— (sin maná)",
        estadisticas = listOf(
            "❤️ Vida: 650.00",
            "💧 Reg. vida (5s): 9.74",
            "🛡️ Armadura: 31.00",
            "🔮 Res. mágica: 32.00", // ver detalle en su página
            "⚔️ Daño de ataque: 93.70",
            "💨 Vel. de ataque: 0.761"
        ),
        descripcion = "Luchador con sustain y gran daño físico.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/1/17/Aspecto_centrado_-_Aatrox_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113042612&path-prefix=es"
    ),

    Champion(
        id = 14,
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Ahri_OriginalSquare.png",
        title = "Ahri",
        surname = "El zorro de nueve colas",
        lanzamiento = "2011-12-14",
        clase = "Maga/Asesina",
        carril = "Mid",
        recurso = "Maná",
        estadisticas = listOf(
            "❤️ Vida: 590.00",
            "💧 Reg. vida (5s): 2.50",
            "🛡️ Armadura: 21.00",
            "🔮 Res. mágica: 30.00",
            "🔋 Maná: 418.00",
            "✨ Reg. maná (5s): 8.00",
            "⚔️ Daño de ataque: 53.00",
            "💨 Vel. de ataque: 0.668"
        ),
        descripcion = "Maga móvil con combos de burst y charms.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/3/35/Aspecto_centrado_-_Ahri_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113035950&path-prefix=es"
    ),

    Champion(
        id = 15,
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Yasuo_OriginalSquare.png",
        title = "Yasuo",
        surname = "El Imperdonable",
        lanzamiento = "2013-12-13",
        clase = "Asesino / Luchador",
        carril = "Mid / Top",
        recurso = "Flujo (sin maná)",
        estadisticas = listOf(
            "❤️ Vida: 590.00",
            "💧 Reg. vida (5s): 6.50",
            "🛡️ Armadura: 30.00",
            "🔮 Res. mágica: 32.00",
            "⚔️ Daño de ataque: 60.00",
            "💨 Vel. de ataque: 0.697"
        ),
        descripcion = "DPS crit/duelista con movilidad y muro.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/e/e9/Aspecto_centrado_-_Yasuo_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113041700&path-prefix=es"
    ),

    Champion(
        id = 16,
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Jinx_OriginalSquare.png",
        title = "Jinx",
        surname = "El Gatillo Suelto",
        lanzamiento = "2013-10-10",
        clase = "Tirador",
        carril = "ADC",
        recurso = "Maná",
        estadisticas = listOf(
            "❤️ Vida: 630.00",
            "💧 Reg. vida (5s): 3.75",
            "🛡️ Armadura: 26.00",
            "🔮 Res. mágica: 30.00",
            "🔋 Maná: 260.00",
            "✨ Reg. maná (5s): 6.70",
            "⚔️ Daño de ataque: 59.00",
            "💨 Vel. de ataque: 0.625"
        ),
        descripcion = "ADC de late game con gran alcance y AOE.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/5/57/Aspecto_centrado_-_Jinx_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113042048&path-prefix=es"
    ),

    Champion(
        id = 17,
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Thresh_OriginalSquare.png",
        title = "Thresh",
        surname = "El Carcelero Implacable",
        lanzamiento = "2013-01-23",
        clase = "Soporte",
        carril = "Soporte",
        recurso = "Maná",
        estadisticas = listOf(
            "❤️ Vida: 600.00",
            "💧 Reg. vida (5s): 7.00",
            "🛡️ Armadura: 31.00",
            "🔮 Res. mágica: 30.00",
            "🔋 Maná: 274.00",
            "✨ Reg. maná (5s): 6.00",
            "⚔️ Daño de ataque: 56.00",
            "💨 Vel. de ataque: 0.625"
        ),
        descripcion = "Soporte con hooks, lantern y control para plays.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/c/c9/Aspecto_centrado_-_Thresh_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113042903&path-prefix=es"
    ),

    Champion(
        id = 18,
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Ekko_OriginalSquare.png",
        title = "Ekko",
        surname = "El Chico que Fragmentó el Tiempo",
        lanzamiento = "2015-05-28",
        clase = "Asesino / Mago",
        carril = "Jungla / Mid",
        recurso = "Maná",
        estadisticas = listOf(
            "❤️ Vida: 655.00",
            "💧 Reg. vida (5s): 9.00",
            "🛡️ Armadura: 32.00",
            "🔮 Res. mágica: 32.00",
            "🔋 Maná: 280.00",
            "✨ Reg. maná (5s): 7.00",
            "⚔️ Daño de ataque: 58.00",
            "💨 Vel. de ataque: 0.688"
        ),
        descripcion = "Asesino con retroceso temporal y daño en ráfagas.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/5/5f/Aspecto_centrado_-_Ekko_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113042427&path-prefix=es"
    ),

    Champion(
        id = 19,
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Samira_OriginalSquare.png",
        title = "Samira",
        surname = "El Desierto Salvaje",
        lanzamiento = "2020-08-20",
        clase = "Tirador / Asesino",
        carril = "ADC / Mid (situacional)",
        recurso = "Maná",
        estadisticas = listOf(
            "❤️ Vida: 630.00",
            "💧 Reg. vida (5s): 3.25",
            "🛡️ Armadura: 26.00",
            "🔮 Res. mágica: 30.00",
            "🔋 Maná: 349.00",
            "✨ Reg. maná (5s): 8.20",
            "⚔️ Daño de ataque: 57.00",
            "💨 Vel. de ataque: 0.658"
        ),
        descripcion = "ADC agresiva que escala con combos y movilidad.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/8/8b/Aspecto_centrado_-_Samira_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113042848&path-prefix=es"
    ),

    Champion(
        id = 20,
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Sett_OriginalSquare.png",
        title = "Sett",
        surname = "El Jefe",
        lanzamiento = "2020-01-14",
        clase = "Luchador",
        carril = "Top / Jungla",
        recurso = "— (sin maná)",
        estadisticas = listOf(
            "❤️ Vida: 670.00",
            "💧 Reg. vida (5s): 7.00",
            "🛡️ Armadura: 33.00",
            "🔮 Res. mágica: 28.00",
            "⚔️ Daño de ataque: 60.00",
            "💨 Vel. de ataque: 0.625"
        ),
        descripcion = "Luchador de primer plano con gran sustain y control.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/9/99/Aspecto_centrado_-_Sett_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113043647&path-prefix=es"
    ),

    Champion(
        id = 21,
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Vex_OriginalSquare.png",
        title = "Vex",
        surname = "La Tristeza Encarnada",
        lanzamiento = "2021-09-23",
        clase = "Mago",
        carril = "Mid",
        recurso = "Maná",
        estadisticas = listOf(
            "❤️ Vida: 590.00",
            "💧 Reg. vida (5s): 9.96",
            "🛡️ Armadura: 48.70",
            "🔮 Res. mágica: 35.51",
            "🔋 Maná: 674.80",
            "✨ Reg. maná (5s): 10.62",
            "⚔️ Daño de ataque: 69.88",
            "💨 Vel. de ataque: 0.705"
        ),
        descripcion = "Mago de control y poke con gran AOE en combates.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/b/bf/Aspecto_centrado_-_Amumu_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113032351&path-prefix=es"
    ),

    Champion(
        id = 22,
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Zed_OriginalSquare.png",
        title = "Zed",
        surname = "El Maestro de las Sombras",
        lanzamiento = "2012-11-13",
        clase = "Asesino AD",
        carril = "Mid / Top",
        recurso = "Energía (en su página figura energía/recursos especiales)",
        estadisticas = listOf(
            "❤️ Vida: 654.00",
            "💧 Reg. vida (5s): 7.00",
            "🛡️ Armadura: 32.00",
            "🔮 Res. mágica: 29.00",
            "⚔️ Daño de ataque: 63.00",
            "💨 Vel. de ataque: 0.651"
        ),
        descripcion = "Asesino AD con sombras para outplay y burst.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/4/4b/Aspecto_centrado_-_Zed_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113042334&path-prefix=es"
    ),

    Champion(
        id = 23,
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Lux_OriginalSquare.png",
        title = "Lux",
        surname = "La Dama de la Luz",
        lanzamiento = "2010-10-19",
        clase = "Maga/Soporte",
        carril = "Mid / Support",
        recurso = "Maná",
        estadisticas = listOf(
            "❤️ Vida: 580.00",
            "💧 Reg. vida (5s): 5.50",
            "🛡️ Armadura: 21.00",
            "🔮 Res. mágica: 30.00",
            "🔋 Maná: 480.00",
            "✨ Reg. maná (5s): 7.00",
            "⚔️ Daño de ataque: 54.00",
            "💨 Vel. de ataque: 0.669"
        ),
        descripcion = "Maga de largo alcance con poke y burst.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/d/d8/Aspecto_centrado_-_Lux_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113035756&path-prefix=es"
    ),

    Champion(
        id = 24,
        imageUrl = "https://leagueoflegends.fandom.com/wiki/Special:FilePath/Kayn_OriginalSquare.png",
        title = "Kayn",
        surname = "El Segador Sombrío",
        lanzamiento = "2017-07-12",
        clase = "Asesino / Luchador",
        carril = "Jungla",
        recurso = "Maná",
        estadisticas = listOf(
            "❤️ Vida: 655.00",
            "💧 Reg. vida (5s): 8.00",
            "🛡️ Armadura: 38.00",
            "🔮 Res. mágica: 32.00",
            "🔋 Maná: 410.00",
            "✨ Reg. maná (5s): 11.50",
            "⚔️ Daño de ataque: 68.00",
            "💨 Vel. de ataque: 0.669"
        ),
        descripcion = "Jungla con transformaciones que cambian su kit.",
        splashUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/b/be/Aspecto_centrado_-_Kayn_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113041337&path-prefix=es"
    )
)
