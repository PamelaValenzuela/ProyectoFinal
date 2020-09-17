package com.example.micronutrientes.model.dabaBase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.micronutrientes.model.dataClass.nutrientes.Micronutrients

@Dao
interface DaoNutrients {
    //Preguntar por que este debe tener onConflict, este sirve para mantener actualizado los nombres
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllNutrients(nutrition:Micronutrients)
    //cuando agregas livedata no se requiere suspend
    @Query("SELECT * FROM tablenutrient" )
    fun getAllNutrientsDB(): LiveData<Micronutrients>
}