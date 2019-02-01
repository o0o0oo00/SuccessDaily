package com.zcy.nidavellir.successdaily

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.zcy.nidavellir.successdaily.adapter.HomeAdapter
import com.zcy.nidavellir.successdaily.adapter.Item
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: HomeAdapter
    private val list: MutableList<Item> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
        adapter = HomeAdapter(R.layout.layout_item, list)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun initData() {
        for (i in 0..10) {
            list.add(Item("标题$i","内容content $i"))
        }
    }
}


