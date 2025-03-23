package com.example.marsphotos.data

import com.example.marsphotos.model.MarsPhoto

interface MarsMoviesRepository {

    suspend fun getMarsMovies(): List<MarsPhoto>

}