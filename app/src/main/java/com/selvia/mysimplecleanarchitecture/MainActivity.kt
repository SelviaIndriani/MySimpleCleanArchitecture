package com.selvia.mysimplecleanarchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.selvia.mysimplecleanarchitecture.databinding.ActivityMainBinding
import com.selvia.mysimplecleanarchitecture.presentation.MainViewModel
import com.selvia.mysimplecleanarchitecture.presentation.MainViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factory = MainViewModelFactory.getInstance()
        val viewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]


        viewModel.setName("Selvia Indriani")
        viewModel.message.observe(this, {
            binding.tvWelcome.text = it.welcomMessage
        })
    }
}