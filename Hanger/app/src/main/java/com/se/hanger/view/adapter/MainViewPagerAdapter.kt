package com.se.hanger.view.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.se.hanger.view.main.CalendarFragment
import com.se.hanger.view.main.MainFragment

class MainViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    private val mainFragmentList = listOf<Fragment>(MainFragment(), CalendarFragment())

    override fun getItemCount() =mainFragmentList.size


    override fun createFragment(position: Int): Fragment {
        return mainFragmentList[position]
    }
}