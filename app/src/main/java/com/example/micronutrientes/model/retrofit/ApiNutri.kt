package com.example.micronutrientes.model.retrofit

import com.example.micronutrientes.model.dataClass.nutrientes.Micronutrients
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiNutri {


    @GET("nutrition-data")
    fun getAllNutrientsFromApi(@Query("app_id") appId:String,
                                       @Query("app_key")appKey:String,
                                       @Query("ingr")ingr:String): Call<Micronutrients>


}