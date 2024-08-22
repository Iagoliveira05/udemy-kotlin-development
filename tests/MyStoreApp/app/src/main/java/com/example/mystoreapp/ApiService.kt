package com.example.mystoreapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


private val retrofit = Retrofit.Builder().baseUrl("https://fakestoreapi.com/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val storeService = retrofit.create(ApiService::class.java)

interface ApiService {
    @GET("products")
    suspend fun getProducts(): List<Product>
}