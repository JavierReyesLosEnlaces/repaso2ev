package com.ruben.repaso2ev

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ruben.repaso2ev.entities.MovieEntity

class MovieAdapter( var movieList: List<MovieEntity> = emptyList() ) : RecyclerView.Adapter<MovieViewHolder>() {

    fun updateList(list: List<MovieEntity>) {
        movieList = list
        notifyDataSetChanged()

        for (s in list){
            Log.d("Lista", s.image)
        }


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        )
    }
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movieList[position])
    }
    override fun getItemCount() = movieList.size
}

