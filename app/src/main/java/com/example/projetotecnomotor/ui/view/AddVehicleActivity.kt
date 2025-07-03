package com.example.projetotecnomotor.ui.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.projetotecnomotor.data.model.Vehicle
import com.example.projetotecnomotor.databinding.ActivityAddVehicleBinding
import com.example.projetotecnomotor.viewmodel.VehicleViewModel

class AddVehicleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddVehicleBinding
    private val viewModel: VehicleViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddVehicleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            val vehicle = Vehicle(
                id = (0..100000).random(),
                modelo = binding.etModel.text.toString(),
                id_montadora = binding.etManufacturerId.text.toString().toInt(),
                motorizacao = binding.etEngine.text.toString(),
                ano = binding.etYear.text.toString().toInt()
            )
            viewModel.add(vehicle)
            finish()
        }
    }
}
