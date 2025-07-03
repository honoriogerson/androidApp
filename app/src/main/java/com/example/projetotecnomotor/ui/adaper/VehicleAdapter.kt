package com.example.projetotecnomotor.ui.adaper

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.projetotecnomotor.data.model.Vehicle
import com.example.projetotecnomotor.databinding.ItemVehicleBinding

class VehicleAdapter :
    ListAdapter<Vehicle, VehicleAdapter.VehicleViewHolder>(DiffCallback()) {

    override  fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VehicleViewHolder {
        val binding = ItemVehicleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VehicleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: VehicleViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class VehicleViewHolder(private val binding: ItemVehicleBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(vehicle: Vehicle) {
            binding.tvModel.text = vehicle.modelo
            binding.tvEngine.text = "Motor: ${vehicle.motorizacao}"
            binding.tvYear.text = "Ano: ${vehicle.ano}"
        }
    }

    class DiffCallback : DiffUtil.ItemCallback<Vehicle>() {
        override fun areItemsTheSame(oldItem: Vehicle, newItem: Vehicle) = oldItem.id == newItem.id
        override fun areContentsTheSame(oldItem: Vehicle, newItem: Vehicle) = oldItem == newItem
    }
}
