package com.makhalibagas.ovo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.makhalibagas.ovo.R
import com.makhalibagas.ovo.ui.lainya.CategoryFragment
import com.makhalibagas.ovo.ui.lainya.FavoriteFragment
import com.makhalibagas.ovo.ui.topup.InstanTopupFragment
import com.makhalibagas.ovo.ui.topup.MotodeLainFragment

class MoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more)


        val tabs = findViewById<TabLayout>(R.id.tabs)
        val vp = findViewById<ViewPager2>(R.id.vp)
        vp.adapter = ViewPagerAdapter(this)

        TabLayoutMediator(tabs, vp,
            TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                when (position) {
                    0 -> tab.text = "Kategori"
                    1 -> tab.text = "Favorite"
                    else -> {
                    }
                }
            }).attach()
    }

    class ViewPagerAdapter internal constructor(fragmentActivity: FragmentActivity) :
        FragmentStateAdapter(fragmentActivity) {
        override fun createFragment(position: Int): Fragment {
            when (position) {
                0 -> return CategoryFragment()
                1 -> return FavoriteFragment()
            }
            return CategoryFragment()
        }

        override fun getItemCount(): Int {
            return 2
        }
    }
}