package com.zcy.nidavellir.successdaily.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.zcy.nidavellir.successdaily.R
import kotlinx.android.synthetic.main.layout_item.view.*

/**
 * @author:         zhaochunyu
 * @description:    ${DESP}
 * @date:           2019/2/1
 */


class HomeAdapter(id: Int, data: List<Item>) : BaseQuickAdapter<Item, BaseViewHolder>(id, data) {
    override fun convert(helper: BaseViewHolder, item: Item) {
        helper.setText(R.id.title, item.title)
        helper.setText(R.id.day, item.day)
        helper.setText(R.id.content, item.content)
        helper.setText(R.id.week, item.week)
        helper.setText(R.id.time, item.time)
    }
}

class Item(
    val title: String,
    val content: String,
    val day: String = "01",
    val week: String = "星期五",
    val time: String = "17.19",
    val moon: String = "smile",
    val weather: String = "rain"
)