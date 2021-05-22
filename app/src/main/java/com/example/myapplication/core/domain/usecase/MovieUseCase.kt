package com.example.myapplication.core.domain.usecase

import androidx.lifecycle.LiveData
import com.example.myapplication.core.data.Resource
import com.example.myapplication.core.domain.model.Movie

interface MovieUseCase {
    fun getAllMovie(): LiveData<Resource<List<Movie>>>
    fun getFavoriteMovie(): LiveData<List<Movie>>
    fun setFavoriteMovie(movie: Movie, state: Boolean)
}