package com.example.projetotecnomotor.ui.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projetotecnomotor.databinding.ActivityMainBinding
import com.example.projetotecnomotor.ui.adaper.VehicleAdapter
import com.example.projetotecnomotor.viewmodel.VehicleViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: VehicleViewModel by viewModels()
    private val adapter = VehicleAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvVehicles.layoutManager = LinearLayoutManager(this)
        binding.rvVehicles.adapter = adapter

        viewModel.vehicles.observe(this) {
            adapter.submitList(it)
        }

        binding.btnSync.setOnClickListener {
            viewModel.fetchAndSave()
        }
    }
}
