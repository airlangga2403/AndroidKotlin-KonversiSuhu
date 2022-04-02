package org.d3if2024.assemsent1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.d3if2024.assemsent1.adapter.ConvertAdapter
import org.d3if2024.assemsent1.data.DataSource
import org.d3if2024.assemsent1.databinding.ActivitySejarahSingkatSuhuBinding

class SejarahSingkatSuhuActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySejarahSingkatSuhuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySejarahSingkatSuhuBinding.inflate(layoutInflater)
        val myDataSet = DataSource().loadDataSuhu()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.sejarahSingkatSuhuRecyclerView.adapter = ConvertAdapter(this, myDataSet)
        with(binding.sejarahSingkatSuhuRecyclerView) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
        }


    }
}