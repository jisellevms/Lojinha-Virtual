package com.jisellemartins.lojinhavirtual.repositories

import com.jisellemartins.lojinhavirtual.model.CategoryModel
import com.jisellemartins.lojinhavirtual.service.ProductsService

class MainRepository constructor(
    private val service: ProductsService
) {

    suspend fun getAllCategories(): List<CategoryModel> {
        val response = service.getAllCategories()

        if (response.isSuccessful) {
            return response.body() ?: emptyList()
        }
        return emptyList()

    }


}

