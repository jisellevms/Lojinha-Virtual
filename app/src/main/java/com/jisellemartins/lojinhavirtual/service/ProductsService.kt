package com.jisellemartins.lojinhavirtual.service

import com.jisellemartins.lojinhavirtual.model.CategoryModel
import com.jisellemartins.lojinhavirtual.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface ProductsService {
    @GET("api/lojinhavirtual/categorias")
    suspend fun getAllCategories(): Response<List<CategoryModel>>
}