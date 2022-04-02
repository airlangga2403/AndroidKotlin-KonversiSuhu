package org.d3if2024.assemsent1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.d3if2024.assemsent1.databinding.ActivityCelciusToReamurBinding

class CelciusToReamurActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCelciusToReamurBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCelciusToReamurBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateBtn.setOnClickListener{convertSuhuReamur()}

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    private fun convertSuhuReamur(){
        val stringInTextField = binding.celciusToReamurEditText.text.toString()
        val suhu = stringInTextField.toDoubleOrNull()

        // Hitung Conversi Suhu Celcius Ke Reamur
        if (suhu == null || suhu == 0.0){
            displayConvert(0.0)
            return
        }
        var reamur = suhu*4/5
        displayConvert(reamur)
    }
    private fun displayConvert(dataCelcius: Double){
        binding.result.text = "Nilai Hasil Konversi: ${dataCelcius}" + "\u2103"
    }

}