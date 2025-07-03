package com.example.projetotecnomotor.data.api

import com.example.projetotecnomotor.data.model.Manufacturer
import com.example.projetotecnomotor.data.model.Vehicle
import retrofit2.http.GET

interface ApiService {
    @GET("manufactures")
    suspend fun getManufacturers(): List<Manufacturer>

    @GET("vehicles")
    suspend fun getVehicles(): List<Vehicle>
}
