package com.jisellemartins.lojinhavirtual.model

import com.google.gson.annotations.SerializedName

class Product (
    @SerializedName("id") val id: String,
    @SerializedName("category") val category: String,
    @SerializedName("title") val title: String,
    @SerializedName("description") val description: String,
    @SerializedName("price") val price: Float,
    @SerializedName("discount") val discount: Boolean,
    @SerializedName("percentDiscount") val percentDiscount: Int,
    @SerializedName("imageURL") val imageUrl: String
)

