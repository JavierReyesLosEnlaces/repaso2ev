package com.ruben.repaso2ev

import android.content.Intent
import android.nfc.NfcAdapter.EXTRA_ID
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.room.Room
import com.ruben.repaso2ev.daos.MovieDao
import com.ruben.repaso2ev.database.MovieDatabase
import com.ruben.repaso2ev.databinding.ActivityMainBinding
import com.ruben.repaso2ev.entities.MovieEntity
import com.ruben.repaso2ev.entities.toDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var room: MovieDatabase
    private lateinit var dao: MovieDao
    private lateinit var adapter: MovieAdapter
    private lateinit var listOfMovies: List<MovieEntity>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fillDatabase()
        initUI()

    }

    private fun initUI() {
        binding.searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                // Añadimos el orEmpty para que si está nulo no haga nada
                searchByName(query.orEmpty())
                return false
            }
            override fun onQueryTextChange(newText: String?) = false
        })
        adapter = MovieAdapter()
        binding.rvMovies.setHasFixedSize(true)
        binding.rvMovies.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvMovies.adapter = adapter
    }



    private fun searchByName(query: String) {
        binding.progressBar.isVisible = true
        CoroutineScope(Dispatchers.IO).launch {
            val myResponse: List<MovieEntity> =
                dao.selectAllMovies("%$query%")
            if (myResponse.size != null) {
                runOnUiThread {
                    adapter.updateList(myResponse)
                    binding.progressBar.isVisible = false
                }
            } else {
                Log.i("Resultado", "No se encuentran resultados")
                binding.progressBar.isVisible = false
            }

        }
    }

    private fun fillDatabase() {
        room = Room.databaseBuilder(this, MovieDatabase::class.java, "movies").build()
        dao = room.getMovies()
        // conseguimos la lista
        var lista = MoviesProvider.getMovies()
        //mapeamos

        CoroutineScope(Dispatchers.IO).launch {
            // Primero eliminamos todos los datos
            dao.deleteAllMovies()

            // Y después insertamos todos los datos
            dao.insertAllMovies(lista.map{it.toDatabase()})

            runOnUiThread {
                binding.progressBar.isVisible = false
            }
        }
    }
}