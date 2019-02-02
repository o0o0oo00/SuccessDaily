package com.zcy.nidavellir.successdaily

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.entity.MultiItemEntity
import com.zcy.nidavellir.successdaily.adapter.ExpandableAdapter
import com.zcy.nidavellir.successdaily.adapter.HomeAdapter
import com.zcy.nidavellir.successdaily.adapter.Item
import com.zcy.nidavellir.successdaily.adapter.SubItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: HomeAdapter
    private lateinit var adapter1: ExpandableAdapter
    private val list: MutableList<Item> = mutableListOf()
    private val expandableList: MutableList<MultiItemEntity> = mutableListOf()
    private val expandableSubList: MutableList<MultiItemEntity> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
        adapter = HomeAdapter(R.layout.layout_item, list)
        adapter1 = ExpandableAdapter(expandableList)
        adapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_RIGHT)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter1
    }

    private fun initData() {

        for (i in 0..10) {
            val item = Item("标题$i", "内容content $i")
            for (i in 0..5){
                item.addSubItem(SubItem("内容$i"))
            }
            expandableList.add(item)
        }
    }
}


