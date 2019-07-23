package com.example.projectbirthday

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_images_page.view.*
import kotlinx.android.synthetic.main.listview_layout.view.*

class customAdapter(var context: Context , var list: ArrayList<Int>):BaseAdapter(){

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var rowView = LayoutInflater.from(context).inflate(R.layout.listview_layout , p2 , false)

        rowView.ivImage.setImageResource(list[p0])

        if (p0 == list.size - 1) {
            Toast.makeText(context, "reached at last", Toast.LENGTH_SHORT).show()

        }


        return rowView

    }

    override fun getItem(p0: Int): Any {
        return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return list.size
    }
}