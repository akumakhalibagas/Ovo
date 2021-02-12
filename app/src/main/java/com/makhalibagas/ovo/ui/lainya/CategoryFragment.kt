package com.makhalibagas.ovo.ui.lainya

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.makhalibagas.ovo.R
import com.makhalibagas.ovo.adapter.CategoryAdapter
import com.makhalibagas.ovo.model.Category
import kotlinx.android.synthetic.main.fragment_category.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CategoryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CategoryFragment : Fragment() {
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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_category, container, false)

        view.rv_category.layoutManager = LinearLayoutManager(context)
        view.rv_category.adapter = CategoryAdapter(listIcon())
        return view
    }

    private fun listIcon() = listOf(
        Category(R.drawable.pln_icon_svg, "PLN"),
        Category(R.drawable.pulsa_icon_svg, "Pulsa"),
        Category(R.drawable.paketdata_icon_svg, "Paket Data"),
        Category(R.drawable.air_icon_svg, "Air PDAM"),
        Category(R.drawable.bpjs_icon_svg, "BPJS"),
        Category(R.drawable.internet_icon_svg, "Internet & TV Kabel"),
        Category(R.drawable.iuran_icon_svg, "Iuran Lingkungan"),
        Category(R.drawable.lainnya_icon_svg, "Lainya")
    )

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment CategoryFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CategoryFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}