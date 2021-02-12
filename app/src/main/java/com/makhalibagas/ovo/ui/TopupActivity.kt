package com.makhalibagas.ovo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
import com.makhalibagas.ovo.R
import com.makhalibagas.ovo.ui.topup.InstanTopupFragment
import com.makhalibagas.ovo.ui.topup.MotodeLainFragment


class TopupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topup)

        val tabs = findViewById<TabLayout>(R.id.tabs)
        val vp = findViewById<ViewPager2>(R.id.vp)
        vp.adapter = ViewPagerAdapter(this)

        TabLayoutMediator(tabs, vp,
            TabConfigurationStrategy { tab, position ->
                when (position) {
                    0 -> tab.text = "Instan Top Up"
                    1 -> tab.text = "Metode Lain"
                    else -> {
                    }
                }
            }).attach()
    }

    class ViewPagerAdapter internal constructor(fragmentActivity: FragmentActivity) :
        FragmentStateAdapter(fragmentActivity) {
        override fun createFragment(position: Int): Fragment {
            when (position) {
                0 -> return InstanTopupFragment()
                1 -> return MotodeLainFragment()
            }
            return InstanTopupFragment()
        }

        override fun getItemCount(): Int {
            return 2
        }
    }
}