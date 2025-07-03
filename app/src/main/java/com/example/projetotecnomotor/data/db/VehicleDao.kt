package com.example.projetotecnomotor.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.projetotecnomotor.data.model.Vehicle

@Dao
interface VehicleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(vehicle: Vehicle)

    @Query("SELECT * FROM vehicles")
    fun getAll(): LiveData<List<Vehicle>>

    @Delete
    suspend fun delete(vehicle: Vehicle)
}
