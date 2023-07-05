package com.example.spotykenya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.spotykenya.databinding.ActivityHomepageBinding

class Homepage : AppCompatActivity() {
    lateinit var binding: ActivityHomepageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    override fun onResume() {
        super.onResume()
        displayArtists()
    }
    fun displayArtists(){
        val name1 =ArtistsData("https://www.billboard.com/wp-content/uploads/media/Roddy-Ricch-press-photo-2020-billboard-1548.jpg?w=942&h=623&crop=1&resize=942%2C623",
            "Roddy Rich")
        val name2 =ArtistsData("https://w0.peakpx.com/wallpaper/120/442/HD-wallpaper-billie-eilish-billie-eilish.jpg",
            "Billie Eilish")
        val name3 = ArtistsData("https://cdn.bhdw.net/im/singer-alessia-cara-black-and-white-wallpaper-116611_w635.webp",
            "Alessia Cara")
        val name4 = ArtistsData("https://i.pinimg.com/564x/70/90/30/7090309b1f43498415e0721bae233827.jpg",
            "Zayn Malik")
        val name7 =ArtistsData("https://images.squarespace-cdn.com/content/v1/5e549165a972c7179b778528/1627176074662-8C6R5XGNWD18QP6N0L2M/Credit_Jeff+Hahn+02_048.jpg?format=750w",
            "Zoe Wees")
        val name8 =ArtistsData("https://image-cdn.hypb.st/https%3A%2F%2Fhypebeast.com%2Fimage%2F2022%2F12%2Fyoung-thug-acronym-behind-stage-name-revealed-000.jpg?fit=max&cbr=1&q=90&w=750&h=500",
            "Young Thug")
        var details = listOf(name1, name2,name3,name4,name7,name8)
        val artistsAdapter = ArtistsRvAdapter(details)
        binding.rvArtists.layoutManager =LinearLayoutManager(this)
        binding.rvArtists.adapter =artistsAdapter
    }
}


