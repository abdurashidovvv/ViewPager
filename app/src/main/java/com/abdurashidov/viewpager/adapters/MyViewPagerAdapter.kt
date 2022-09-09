package com.abdurashidov.viewpager.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.abdurashidov.viewpager.databinding.ItemViewPagerBinding
import com.abdurashidov.viewpager.models.User
import com.squareup.picasso.Picasso

class MyViewPagerAdapter(val context: Context, val list:ArrayList<User>):PagerAdapter() {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val layoutInflater=LayoutInflater.from(context)
        val view=ItemViewPagerBinding.inflate(layoutInflater, container, false)

        view.itemTv.text=list[position].name
        view.itemImage.setImageResource(list[position].image)

        container.addView(view.root)
        return view.root
    }

    override fun getCount(): Int {
        return list.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view==`object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

}