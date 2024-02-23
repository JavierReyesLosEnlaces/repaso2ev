package com.ruben.repaso2ev

data class Movie (
    val title: String,
    val releaseDate: String,
    val duration: String,
    val image: String,
    val synopsis: String,
    val genre: String,
    val director: String,
    val leadActor: String,
    val writer1: String,
    val writer2: String = "",
    val writer3: String = "",
    val writer4: String = ""
)