package com.makhalibagas.ovo.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import com.makhalibagas.ovo.R
import com.makhalibagas.ovo.adapter.PromoAdapter
import com.makhalibagas.ovo.model.Promo
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlin.math.abs

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        //set viewpager2
        view.vp_promo.adapter = PromoAdapter(listData())
        view.vp_promo.clipToPadding = false
        view.vp_promo.clipChildren = false
        view.vp_promo.offscreenPageLimit = 3
        view.vp_promo.getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER
        val compositePageTransformer = CompositePageTransformer()
        compositePageTransformer.addTransformer(MarginPageTransformer(15))
        view.vp_promo.setPageTransformer(compositePageTransformer)

        view.linear_topup.setOnClickListener {
            startActivity(Intent(context, TopupActivity::class.java))
        }

        view.ls_bantuan.setOnClickListener {
            startActivity(Intent(context, HelpActivity::class.java))
        }

        view.bt_more.setOnClickListener {
            startActivity(Intent(context, MoreActivity::class.java))
        }

        return view
    }

    private fun listData() = listOf(
        Promo(R.drawable.img9),
        Promo(R.drawable.img11),
        Promo(R.drawable.img10),
        Promo(R.drawable.img1),
        Promo(R.drawable.img2),
        Promo(R.drawable.img3),
        Promo(R.drawable.img4),
        Promo(R.drawable.img5),
        Promo(R.drawable.img6),
        Promo(R.drawable.img7),
        Promo(R.drawable.img8)
    )
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}