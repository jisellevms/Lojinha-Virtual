package com.jisellemartins.lojinhavirtual.model

import com.google.gson.annotations.SerializedName

class CategoryModel(
    @SerializedName("categoria") val category: String,
    @SerializedName("icon") val icon: String,
    @SerializedName("id") val id:Int,
    @SerializedName("produtos") val products: List<Product>
)