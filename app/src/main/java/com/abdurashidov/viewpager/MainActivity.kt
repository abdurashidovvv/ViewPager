package com.abdurashidov.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abdurashidov.viewpager.adapters.MyViewPagerAdapter
import com.abdurashidov.viewpager.databinding.ActivityMainBinding
import com.abdurashidov.viewpager.models.User

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var list:ArrayList<User>
    private lateinit var myViewPagerAdapter: MyViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()
        myViewPagerAdapter=MyViewPagerAdapter(this, list)
        binding.viewPager.adapter=myViewPagerAdapter

    }

    private fun loadData() {
        list= ArrayList()
        list.add(User("Maktab", R.drawable.img))
        list.add(User("Inflyatsiya", R.drawable.img_1))
        list.add(User("Shaxmat", R.drawable.img_2))
    }
}