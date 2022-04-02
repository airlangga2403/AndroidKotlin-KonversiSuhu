package org.d3if2024.assemsent1.data

import org.d3if2024.assemsent1.R
import org.d3if2024.assemsent1.model.Suhu

class DataSource {
    fun loadDataSuhu():List<Suhu>{
        return listOf<Suhu>(
            Suhu(R.string.penjelasan_suhu1,R.drawable.celcius),
            Suhu(R.string.penjelasan_suhu2,R.drawable.farenheit),
            Suhu(R.string.penjelasan_suhu3,R.drawable.reamur),
            Suhu(R.string.penjelasan_suhu4,R.drawable.kelvin)
        )
    }
}