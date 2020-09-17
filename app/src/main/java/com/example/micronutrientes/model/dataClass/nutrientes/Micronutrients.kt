package com.example.micronutrientes.model.dataClass.nutrientes

import androidx.room.*
import com.example.micronutrientes.model.dataClass.TotalDaily
import com.example.micronutrientes.model.dataClass.totalnutrientes.TotalNutrients

@Entity(tableName = "tableNutrient")
data class Micronutrients(
    val calories: Int?,
   // @Embedded val totalDaily: TotalDaily,
    @Embedded val totalNutrients: TotalNutrients,
    val totalWeight: Double?,
    @PrimaryKey val uri: String
)