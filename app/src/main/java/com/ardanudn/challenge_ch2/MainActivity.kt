package com.ardanudn.challenge_ch2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.rv_menu)
        recyclerView.layoutManager = GridLayoutManager(this,2)

        // Inisialisasi data menu makanan
        val menuMakanan = mutableListOf<MenuMakanan>()
        menuMakanan.add(MenuMakanan(R.drawable.burger, "Burger", "Rp. 28.000"))
        menuMakanan.add(MenuMakanan(R.drawable.ayamgoreng, "Ayam Goreng", "Rp. 20.000"))
        menuMakanan.add(MenuMakanan(R.drawable.ayampanggang, "Ayam Panggang", "Rp. 25.000"))
        menuMakanan.add(MenuMakanan(R.drawable.dimsum, "Dim Sum", "Rp. 27.000"))

        // Inisialisasi adapter
        val menuAdapter : MenuAdapter = MenuAdapter(menuMakanan)
        recyclerView.adapter = menuAdapter
    }
}