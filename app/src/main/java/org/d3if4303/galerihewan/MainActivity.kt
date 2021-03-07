package org.d3if4303.galerihewan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.d3if4303.galerihewan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        Log.d("MainActivity", "Jumlah Data:"+ getData().size)
        with(binding.recyclerView) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }
    }

    private fun getData(): List<Hewan>{
        return listOf(
            Hewan("Angsa", "Cygnus olor", R.drawable.angsa,"Unggas"),
            Hewan("Ayam", "Gallus gallus", R.drawable.ayam,"Unggas"),
            Hewan("Bebek", "Cairina moschata", R.drawable.bebek,"Unggas"),
            Hewan("Domba", "Ovis ammon", R.drawable.domba,"Mamalia"),
            Hewan("Kalkun", "Meleagris gallopavo", R.drawable.kalkun,"Unggas"),
            Hewan("Kambing", "Capricornis sumatrensis", R.drawable.kambing,"Mamalia"),
            Hewan("Kelinci", "Oryctolagus cuniculus", R.drawable.kelinci,"Mamalia"),
            Hewan("Kera", "Bubalus bubalis", R.drawable.kerbau,"Mamalia"),
            Hewan("Kuda", "Equus caballus", R.drawable.kuda,"Mamalia"),
            Hewan("Sapi", "Bos taurus", R.drawable.sapi,"Mamalia")
        )


    }
}