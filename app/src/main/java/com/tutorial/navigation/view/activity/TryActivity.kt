package com.tutorial.navigation.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tutorial.navigation.databinding.ActivityTryBinding
import com.tutorial.navigation.model.DataModel

class TryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Try"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val intent = intent
        if(intent.hasExtra("DATA_MODEL")) {
            val dataModel: DataModel? = getIntent().getParcelableExtra("DATA_MODEL")
            if (dataModel != null) {
                binding.textView.text = dataModel.name.trim()
            }
        } else {
            binding.textView.text = "Percobaan"
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
