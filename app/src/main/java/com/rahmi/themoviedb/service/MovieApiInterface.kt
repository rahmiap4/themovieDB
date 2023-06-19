package com.rahmi.themoviedb.service

import com.rahmi.themoviedb.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=70bcf9bfba19f9a43d1ede16a8ece89f")
    fun getMovieList(): Call<MovieResponse>
}