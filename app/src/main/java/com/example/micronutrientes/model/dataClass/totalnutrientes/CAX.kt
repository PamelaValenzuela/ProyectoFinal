package com.example.micronutrientes.model.dataClass

import androidx.room.ColumnInfo

data class CAX(
    @ColumnInfo(name="label_CA") val label: String?,
    @ColumnInfo(name="quantity_CA")val quantity: Double?,
    @ColumnInfo(name="unit_CA") val unit: String?
)