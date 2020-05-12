package com.tutorial.navigation.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import com.tutorial.navigation.databinding.ActivityTryBinding

class TryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Try"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
