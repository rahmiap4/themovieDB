package com.rahmi.themoviedb.service

import com.rahmi.themoviedb.model.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=70bcf9bfba19f9a43d1ede16a8ece89f")
    fun getTVList(): Call<TVResponse>
}