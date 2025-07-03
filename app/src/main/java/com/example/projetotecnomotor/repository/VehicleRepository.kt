package com.example.projetotecnomotor.repository

import androidx.lifecycle.LiveData
import com.example.projetotecnomotor.data.api.ApiService
import com.example.projetotecnomotor.data.db.VehicleDao
import com.example.projetotecnomotor.data.model.Vehicle

class VehicleRepository(
    private val dao: VehicleDao,
    private val api: ApiService
) {
    val vehicles: LiveData<List<Vehicle>> = dao.getAll()

    suspend fun fetchVehiclesFromApiAndSave() {
        val vehiclesFromApi = api.getVehicles()
        for (vehicles in vehiclesFromApi){
            dao.insert(vehicles)
        }
    }

    suspend fun addVehicle(vehicle: Vehicle) = dao.insert(vehicle)
    suspend fun deleteVehicle(vehicle: Vehicle) = dao.delete(vehicle)
}
