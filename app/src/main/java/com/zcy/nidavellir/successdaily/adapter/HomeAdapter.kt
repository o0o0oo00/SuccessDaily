package com.zcy.nidavellir.successdaily.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.chad.library.adapter.base.entity.AbstractExpandableItem
import com.chad.library.adapter.base.entity.MultiItemEntity
import com.zcy.nidavellir.successdaily.R
import com.zcy.nidavellir.successdaily.adapter.ExpandableAdapter.Companion.ITEM
import com.zcy.nidavellir.successdaily.adapter.ExpandableAdapter.Companion.SUB_ITEM

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
) : AbstractExpandableItem<SubItem>(), MultiItemEntity {
    override fun getItemType(): Int {
        return ITEM
    }

    override fun getLevel(): Int {
        return 0
    }
}

class SubItem(
    val title: String
) : MultiItemEntity {
    override fun getItemType(): Int {
        return SUB_ITEM
    }
}