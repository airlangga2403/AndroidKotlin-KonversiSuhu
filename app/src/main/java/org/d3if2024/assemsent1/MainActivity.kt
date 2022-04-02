package org.d3if2024.assemsent1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if2024.assemsent1.data.DataSource
import org.d3if2024.assemsent1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listIntent: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.celciusToFarenhitBtn.setOnClickListener { launchCelciusToFarenhit() }
        binding.celciusToReamurBtn.setOnClickListener { launchCelciusToReamur() }
        binding.celciusToKelvinBtn.setOnClickListener { launchCelciusToKelvin() }
        binding.sejarahSingkatSuhuBtn.setOnClickListener { launchSejarahSingkatSuhu() }


    }

    private fun launchCelciusToFarenhit() {
        listIntent = Intent(this, CelciusToFarenheitActivity::class.java)
        startActivity(listIntent)

    }

    private fun launchCelciusToKelvin() {
        listIntent = Intent(this, CelciusToKelvinActivity::class.java)
        startActivity(listIntent)

    }

    private fun launchCelciusToReamur() {
        listIntent = Intent(this, CelciusToReamurActivity::class.java)
        startActivity(listIntent)
    }

    private fun launchSejarahSingkatSuhu() {
        listIntent = Intent(this, SejarahSingkatSuhuActivity::class.java)
        startActivity(listIntent)
    }
}