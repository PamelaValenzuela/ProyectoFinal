package com.example.micronutrientes.model.dabaBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.micronutrientes.model.dataClass.nutrientes.Micronutrients

@Database(entities = [(Micronutrients::class)], version = 1)
abstract class DBNutrients:RoomDatabase() {

    abstract fun getMicronutrientsDao():DaoNutrients



    //Esta linea de codigo indica que es und metodo estatico que se realiza sólo una vez
    companion object{

        //no entiendo por que se debe ocupar volatile
        @Volatile
        private var INSTANCE: DBNutrients?= null

        fun getDBNutrients(context: Context):DBNutrients{
            val createdInstance= INSTANCE
            if (createdInstance!=null){
                return createdInstance
            }
            synchronized(this){
                val newInstance= Room.databaseBuilder(context.applicationContext, DBNutrients::class.java, "nutri_db")
                    //se necesita cuando se realizan cambios a la database
                    .fallbackToDestructiveMigrationFrom(1,2,3,4,5,6,7,8,9,10,11,12,13)
                    .build()
                INSTANCE= newInstance
                return newInstance
            }

        }

    }
}