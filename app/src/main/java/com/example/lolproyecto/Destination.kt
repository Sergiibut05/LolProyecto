package com.example.lolproyecto

import kotlinx.serialization.Serializable

@Serializable
sealed class Destination(val route:String) {
    @Serializable
    object List: Destination("champion-list")
    @Serializable
    data class Detail(val id:Long): Destination(route = "detail/$id")
    /**
     * Si no enviara valor
     * @Serializable
     * object Create: Destination("todo_create")
     * */
}