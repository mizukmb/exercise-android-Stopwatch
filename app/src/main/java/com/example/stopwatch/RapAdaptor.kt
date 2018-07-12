package com.example.stopwatch

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class RapAdaptor(val context: Context): RecyclerView.Adapter<RapAdaptor.RapHolder>() {
    private val items: ArrayList<String> = ArrayList()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RapHolder {
        return RapHolder(LayoutInflater.from(context).inflate(R.layout.item_rap, p0, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: RapHolder, index: Int) {
        p0.onBind(items.get(index))
    }

    fun addRap(rap: String) {
        items.add(0, rap)
    }

    inner class RapHolder(item: View): RecyclerView.ViewHolder(item) {
        private var item: View = item

        fun onBind(rapTime: String) {
            val rapLabel = item.findViewById<TextView>(R.id.rap_label)
            rapLabel.text = rapTime
        }
    }
}