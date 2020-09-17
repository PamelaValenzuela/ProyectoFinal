package com.example.micronutrientes.model

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import com.example.micronutrientes.model.dabaBase.DBNutrients
import com.example.micronutrientes.model.dataClass.nutrientes.Micronutrients
import com.example.micronutrientes.model.retrofit.API_ID
import com.example.micronutrientes.model.retrofit.API_KEY
import com.example.micronutrientes.model.retrofit.RetrofitClientNutri
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoryNutri(context:Context) {
    //aca se hace el llamado
    val retrofit=RetrofitClientNutri.retrofitInstance()
    val db=DBNutrients.getDBNutrients(context)
    val dao=db.getMicronutrientsDao()

    fun llamado(ingr:String){
        retrofit.getAllNutrientsFromApi(API_ID, API_KEY,ingr).enqueue(object:
            Callback<Micronutrients>{
            override fun onResponse(
                call: Call<Micronutrients>,
                response: Response<Micronutrients>
            ) {
                Log.d("Pame","ver Url ${retrofit.getAllNutrientsFromApi(API_ID, API_KEY,ingr).request().url()}")
                CoroutineScope(IO).launch {
                    response.body()?.let { dao.insertAllNutrients(it) }
                }
            }

            override fun onFailure(call: Call<Micronutrients>, t: Throwable) {
                Log.d("Pame","ver Url ${retrofit.getAllNutrientsFromApi(API_ID, API_KEY,ingr).request().url()}")
                Log.d("pame","Internet Failed $t")
            }

        })
    }
    fun obtenerListadoDesdeDB(): LiveData<Micronutrients> {
        return dao.getAllNutrientsDB()
    }
}