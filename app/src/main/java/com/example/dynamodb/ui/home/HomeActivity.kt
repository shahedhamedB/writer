package com.example.dynamodb.ui.home

import android.os.Bundle
import com.example.dynamodb.core.base.BaseActivity
import com.example.dynamodb.databinding.ActivityHomeBinding
import dagger.hilt.android.AndroidEntryPoint



@AndroidEntryPoint
class HomeActivity : BaseActivity() {

    lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)

        setContentView(binding.root)

    }






}