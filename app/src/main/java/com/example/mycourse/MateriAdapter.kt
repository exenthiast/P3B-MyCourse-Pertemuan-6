package com.example.mycourse

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mycourse.databinding.MateriItemBinding

typealias OnClickMateri = (Materi) -> Unit
class MateriAdapter(
    private val listMateri: List<Materi>,
    private val onClickMateri: OnClickMateri):
    RecyclerView.Adapter<com.example.mycourse.MateriAdapter.ItemMateriViewHolder>(){

    // handle bagaimana UI tiap item akan di tampilkan
    inner  class ItemMateriViewHolder(private val binding: MateriItemBinding):
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Materi) {
            with(binding) {
                txtTitle.text = data.title
                txtDescription.text = data.description
                txtDate.text = data.date
                itemView.setOnClickListener {
                    onClickMateri(data)
                }
            }
        }
    }

    // buat holder yang akan meng handle setiap item ditampilkan
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemMateriViewHolder {
        val binding = MateriItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemMateriViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ItemMateriViewHolder,
        position: Int
    ) {
        holder.bind(listMateri[position])
    }

    override fun getItemCount(): Int {
        return listMateri.count()
    }
}