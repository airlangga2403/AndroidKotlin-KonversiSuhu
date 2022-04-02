package org.d3if2024.assemsent1

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.d3if2024.assemsent1.databinding.ActivityCelciusToKelvinBinding

class CelciusToKelvinActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCelciusToKelvinBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCelciusToKelvinBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateBtn.setOnClickListener{convertSuhuKelvin()}
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    private fun convertSuhuKelvin(){
        val stringInTextField = binding.celciusToKelvinEditText.text.toString()
        val suhu = stringInTextField.toDoubleOrNull()

        // Hitung Conversi Suhu Celcius Ke Kelvin
        if (suhu == null || suhu == 0.0){
            displayConvert(0.0)
            return
        }
        var kelvin = suhu+273
        displayConvert(kelvin)
    }
    private fun displayConvert(dataCelcius: Double){
        binding.result.text = "Nilai Hasil Konversi: ${dataCelcius}" + "\u2103"
    }
}