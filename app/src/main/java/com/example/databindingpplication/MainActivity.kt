package com.example.databindingpplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingpplication.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    lateinit var  binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.setText1("this is one")
        binding.setText2("this is Two")
        binding.text3 = "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg"

    }
}