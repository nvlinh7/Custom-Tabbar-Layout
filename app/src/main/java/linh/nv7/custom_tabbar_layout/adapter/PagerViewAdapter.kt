package linh.nv7.custom_tabbar_layout.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import linh.nv7.custom_tabbar_layout.ui.*

internal class PagerViewAdapter (fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> {
                HomeFragment()
            }
            1 -> {
                SearchFragment()
            }
            2 -> {
                AddFragment()
            }
            3 -> {
                NotificationFragment()
            }
            4 -> {
                ProfileFragment()
            }
            else -> HomeFragment()
        }
    }

    override fun getCount(): Int {
        return 5
    }


}