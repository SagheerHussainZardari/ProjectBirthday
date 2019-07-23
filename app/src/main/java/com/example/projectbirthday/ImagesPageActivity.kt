package com.example.projectbirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_images_page.*
import kotlinx.android.synthetic.main.activity_images_page.view.*

class ImagesPageActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_images_page)

        tvNextPage2.visibility = View.VISIBLE

        var list = ArrayList<Int>()
        list.add(R.drawable.pic)
        list.add(R.drawable.pic2)
        list.add(R.drawable.pic)
        list.add(R.drawable.pic2)
        list.add(R.drawable.pic)
        list.add(R.drawable.pic2)
        list.add(R.drawable.pic)
        list.add(R.drawable.pic2)

        listview.adapter = customAdapter(this , list)


    }



}


