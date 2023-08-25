package com.jisellemartins.lojinhavirtual.utils

public fun discountCalc(hasDiscount: Boolean, price: Float, discount: Int): Float {
    if (hasDiscount) {
        val total = price - (price * discount / 100)
        return total
    }
    return price
}