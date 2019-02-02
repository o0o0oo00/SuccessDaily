package com.zcy.nidavellir.successdaily.adapter

import android.util.Log
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.chad.library.adapter.base.entity.MultiItemEntity
import com.zcy.nidavellir.successdaily.R

/**
 * @author:         zhaochunyu
 * @description:    ${DESP}
 * @date:           2019/2/2
 */
class ExpandableAdapter(data: List<MultiItemEntity>) : BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder>(data) {
    init {
        addItemType(ITEM, R.layout.layout_item)
        addItemType(SUB_ITEM, R.layout.layout_sub_item)
    }

    override fun convert(helper: BaseViewHolder, item: MultiItemEntity) {
        when (helper.itemViewType) {
            ITEM -> {
                item as Item
                helper.setText(R.id.title, item.title)
                helper.setText(R.id.day, item.day)
                helper.setText(R.id.content, item.content)
                helper.setText(R.id.week, item.week)
                helper.setText(R.id.time, item.time)

                helper.itemView.setOnClickListener {
                    val pos = helper.adapterPosition
                    Log.d(TAG, "Level 0 item pos: " + pos)
                    if (item.isExpanded) {
                        collapse(pos)
                    } else {
                        expand(pos)
                    }
                }
            }
            SUB_ITEM -> {
                item as SubItem
                helper.setText(R.id.title, item.title)
            }
        }
    }

    companion object {
        private val TAG = ExpandableAdapter::class.java.simpleName

        val ITEM = 0
        val SUB_ITEM = 1
    }
}
