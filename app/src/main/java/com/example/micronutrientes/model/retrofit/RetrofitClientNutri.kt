package com.example.micronutrientes.model.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
const val API_ID="62d6bc9b"
const val API_KEY="48fd19a9a48cdd81ea1aa421bb56efc7"
class RetrofitClientNutri {



    companion object {
        private const val BASE_URL = "https://api.edamam.com/api/"

        fun retrofitInstance(): ApiNutri {

            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(ApiNutri::class.java)

        }
    }
}