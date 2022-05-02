package com.example.listapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.listapp.databinding.ActivityDetailsBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding
    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        //data
        val pisa = Landmark("Pisa", "Italy", R.drawable.pisa)
        val flame = Landmark("Flame Towers", "Azerbaijan", R.drawable.f1)
        val bridge = Landmark("London Bridge", "Britain", R.drawable.londonbridge)
        val copenhagen = Landmark("Copenhagen", "Denmark", R.drawable.kopenhagen)

        landmarkList.add(pisa)
        landmarkList.add(flame)
        landmarkList.add(bridge)
        landmarkList.add(copenhagen)

        
    }
}