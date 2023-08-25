package com.jisellemartins.lojinhavirtual.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jisellemartins.lojinhavirtual.extensions.toLiveData
import com.jisellemartins.lojinhavirtual.model.CategoryModel
import com.jisellemartins.lojinhavirtual.model.Product
import com.jisellemartins.lojinhavirtual.repositories.MainRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: MainRepository) : ViewModel() {
    val _liveData = MutableLiveData<List<CategoryModel>>()
    val liveData = _liveData.toLiveData()
    var listCategoriesCache: List<CategoryModel> = emptyList()

    fun getCategoriesList() {
        viewModelScope.launch {
            listCategoriesCache = repository.getAllCategories()
            _liveData.value = listCategoriesCache
        }
    }
    fun stateInicial(){
        _liveData.value = listCategoriesCache
    }

    fun filterCategory(idCategory: Int) {
        val listFilter = listCategoriesCache.filter { categoryModel ->
            categoryModel.id == idCategory
        }
        _liveData.value = listFilter
    }

    fun filterCategoryByName(name: String) {
        val listFilter = listCategoriesCache.filter { categoryModel ->
            categoryModel.category.contains(name, ignoreCase = true)
        }
        _liveData.value = listFilter
    }

}