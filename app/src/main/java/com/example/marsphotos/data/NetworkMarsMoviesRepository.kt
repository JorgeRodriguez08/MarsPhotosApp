package com.example.marsphotos.data

import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.network.MarsApiService

class NetworkMarsMoviesRepository(
    private val marsApiService: MarsApiService
) : MarsMoviesRepository {

    override suspend fun getMarsMovies(): List<MarsPhoto> = marsApiService.getMovies()

}