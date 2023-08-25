package com.jisellemartins.lojinhavirtual.di

import com.jisellemartins.lojinhavirtual.repositories.MainRepository
import com.jisellemartins.lojinhavirtual.service.ProductsService
import com.jisellemartins.lojinhavirtual.service.service
import com.jisellemartins.lojinhavirtual.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val moduleGlobal = module {
    single<Retrofit> { service.api }
    single<ProductsService> { get<Retrofit>().create(ProductsService::class.java)}
    single<MainRepository> { MainRepository(get()) }
    viewModel<MainViewModel>{ MainViewModel(get())}
}