package com.jisellemartins.lojinhavirtual.model

class Product (
    val id: String,
    val category: String,
    val title: String,
    val description: String,
    val price: Float,
    val discount: Boolean,
    val percentDiscount: Int,
    val imageUrl: String
)

