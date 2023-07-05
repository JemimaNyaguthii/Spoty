package com.example.spotykenya

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spotykenya.databinding.ArtistsBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ArtistsRvAdapter (var artistsData:List<ArtistsData>): RecyclerView.Adapter<ArtistsRvAdapter.ArtistsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistsViewHolder {
        val binding = ArtistsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ArtistsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ArtistsViewHolder, position: Int) {
        val artistsViews = artistsData.get(position)
        val binding = holder.binding
        binding.tvName.text = artistsViews.name
        binding.tvName.tag = artistsViews.image
        if (artistsViews.image != null) {
            Picasso
                .get().load(artistsViews.image)
                .resize(80, 80)
                .centerInside()
                .transform(CropCircleTransformation())
                .into(binding.ivAvatar);
        } else {
            // Display a default image
        }
    }

    override fun getItemCount(): Int {
        return artistsData.size
    }

    class ArtistsViewHolder(var binding: ArtistsBinding):RecyclerView.ViewHolder(binding.root)
}