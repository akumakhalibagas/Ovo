package com.makhalibagas.ovo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.makhalibagas.ovo.R
import com.makhalibagas.ovo.adapter.HelpAdapter
import com.makhalibagas.ovo.model.Help
import kotlinx.android.synthetic.main.activity_help.*

class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)


        rv_help.layoutManager = LinearLayoutManager(this)
        rv_help.adapter = HelpAdapter(listData())
    }


    private fun listData() = listOf(
        Help(R.drawable.info_svg, "Info Umum"),
        Help(R.drawable.account_svg, "Akun dan Pengaturan"),
        Help(R.drawable.premiere_svg, "Upgrade ke Premiere"),
        Help(R.drawable.topup_svg, "Top Up"),
        Help(R.drawable.tf_svg, "Transfer"),
        Help(R.drawable.bill_svg, "Tagihan & Isi Ulang"),
        Help(R.drawable.deals_svg, "Deals"),
        Help(R.drawable.parking_svg, "Parking"),
        Help(R.drawable.info_svg, "OVO Invest"),
        Help(R.drawable.invest_svg, "OVO Paylater"),
        Help(R.drawable.grab_svg, "Grab & Pembayaran"),
        Help(R.drawable.grab_svg, "Fave"),
        Help(R.drawable.grab_svg, "Tokopedia"),
        Help(R.drawable.info_svg, "Lainya")
    )
}