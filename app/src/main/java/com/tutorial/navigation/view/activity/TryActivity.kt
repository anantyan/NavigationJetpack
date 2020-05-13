package com.tutorial.navigation.view.activity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.navArgs
import com.tutorial.navigation.databinding.ActivityTryBinding
import com.tutorial.navigation.model.DataModel
import java.lang.IllegalArgumentException

class TryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTryBinding
    private lateinit var dataModel: DataModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Try"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val intent = intent
        if(intent.hasExtra("DATA_MODEL")) {
            dataModel = getIntent().getParcelableExtra("DATA_MODEL")
            binding.textView.text = dataModel.name.trim()
        } else {
            binding.textView.text = "Percobaan"
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
