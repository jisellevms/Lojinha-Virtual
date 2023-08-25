package com.jisellemartins.lojinhavirtual.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object service {
     val api
        get() = Retrofit.Builder()
            .baseUrl("https://64e40f04bac46e480e795ada.mockapi.io/")
            .addConverterFactory(GsonConverterFactory.create()).build()

    val productService = api.create(ProductsService::class.java)
}


