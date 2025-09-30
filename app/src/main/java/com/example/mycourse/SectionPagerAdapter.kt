package com.example.mycourse

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionPagerAdapter(activity: AppCompatActivity) :
    FragmentStateAdapter(activity){

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = MateriSatuFragment()
            1 -> fragment = MateriDuaFragment()
        }
        return fragment as Fragment

    }

    override fun getItemCount(): Int {
        return 2
    }
}