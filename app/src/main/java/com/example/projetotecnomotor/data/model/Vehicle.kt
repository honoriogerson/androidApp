package com.example.projetotecnomotor.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "vehicles")
data class Vehicle(
    @PrimaryKey val id: Int,
    val modelo: String,
    val id_montadora: Int,
    val motorizacao: String,
    val ano: Int
)
