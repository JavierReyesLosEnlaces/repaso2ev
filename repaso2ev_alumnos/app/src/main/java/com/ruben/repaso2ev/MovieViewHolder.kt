package com.ruben.repaso2ev

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ruben.repaso2ev.databinding.ItemLayoutBinding
import com.ruben.repaso2ev.entities.MovieEntity
import com.squareup.picasso.Picasso

class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemLayoutBinding.bind(view)

    fun bind(movieItemResponse: MovieEntity) {
        Picasso.get().load(movieItemResponse.image).into(binding.ivMovie)
        binding.tvTitle.text = movieItemResponse.title
        binding.tvReleaseDate.text = movieItemResponse.releaseDate
        binding.tvDuration.text = movieItemResponse.duration
        binding.tvGenre.text = movieItemResponse.genre
        binding.tvSynopsis.text = movieItemResponse.synopsis
        binding.tvDirector.text = movieItemResponse.director
        binding.tvLeadActor.text = movieItemResponse.leadActor
        binding.tvWriters.text = movieItemResponse.writer1+"\n"+movieItemResponse.writer2+"\n"+movieItemResponse.writer3+"\n"+movieItemResponse.writer4
    }

}
