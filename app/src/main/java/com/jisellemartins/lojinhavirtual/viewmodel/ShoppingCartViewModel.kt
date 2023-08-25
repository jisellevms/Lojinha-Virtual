package com.jisellemartins.lojinhavirtual.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jisellemartins.lojinhavirtual.extensions.toLiveData
import com.jisellemartins.lojinhavirtual.model.Product
import kotlinx.coroutines.launch

class ShoppingCartViewModel() : ViewModel() {

    val _liveData = MutableLiveData<Int>()
    val liveData = _liveData.toLiveData()
    var count = 1
    fun AddProduct(){
        viewModelScope.launch {
            _liveData.value = count++
        }
    }

    fun AddProductToList(product: Product){
        viewModelScope.launch {
            val listCart:MutableList<Product> = mutableListOf()
            listCart.add(product)
        }
    }
}