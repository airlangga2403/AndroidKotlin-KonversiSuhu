package org.d3if2024.assemsent1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.d3if2024.assemsent1.databinding.ActivityCelciusToFarenheitBinding

class CelciusToFarenheitActivity: AppCompatActivity() {
    private lateinit var binding: ActivityCelciusToFarenheitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCelciusToFarenheitBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateBtn.setOnClickListener{convertSuhuFarenheit()}
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    private fun convertSuhuFarenheit(){
        val stringInTextField = binding.celciusToFarenheitEditText.text.toString()
        val suhu = stringInTextField.toDoubleOrNull()

        // Hitung Conversi Suhu Celcius Ke Farenheit
        if (suhu == null || suhu == 0.0){
            displayConvert(0.0)
            return
        }
        var farenheit = (suhu*9/5)+32
        displayConvert(farenheit)
    }
    private fun displayConvert(dataCelcius: Double){
        binding.result.text = "Nilai Hasil Konversi: ${dataCelcius}" + "\u2103"
    }
}