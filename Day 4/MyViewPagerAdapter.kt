package com.example.projecttalenthub4_2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.projecttalenthub4_2.fragments.AFragment
import com.example.projecttalenthub4_2.fragments.BFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AFragment()
            1 -> BFragment()
            else -> AFragment()
        }
    }

    override fun getItemCount(): Int {
        return 2
    }
}
