package com.example.eval_8_11.Networks

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetWork {
    companion object {
        fun getRetrofit() = Retrofit.Builder()
            .baseUrl("https://newsapi.org/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}