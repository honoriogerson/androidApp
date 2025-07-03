package com.example.projetotecnomotor.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.projetotecnomotor.data.db.AppDatabase
import com.example.projetotecnomotor.data.model.Vehicle
import com.example.projetotecnomotor.data.api.RetrofitInstance
import com.example.projetotecnomotor.repository.VehicleRepository
import kotlinx.coroutines.launch

class VehicleViewModel(application: Application) : AndroidViewModel(application) {
    private val dao = AppDatabase.getDatabase(application).vehicleDao()
    private val repo = VehicleRepository(dao, RetrofitInstance.api)

    val vehicles = repo.vehicles

    fun fetchAndSave() = viewModelScope.launch {
        try {
            repo.fetchVehiclesFromApiAndSave()
        } catch (e: Exception) {
            // handle error
        }
    }

    fun add(vehicle: Vehicle) = viewModelScope.launch { repo.addVehicle(vehicle) }
    fun delete(vehicle: Vehicle) = viewModelScope.launch { repo.deleteVehicle(vehicle) }
}
