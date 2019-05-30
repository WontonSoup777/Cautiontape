package com.miniappcanada.winstonzhao.cautiontape

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_home, container, false)


    companion object {
        fun newInstance(): HomeFragment = HomeFragment()
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        about_button.setOnClickListener {
            val intent = Intent (this@HomeFragment.context, AboutActivity::class.java)
            startActivity(intent)
        }

        floatingScoutButton.setOnClickListener {
            val intent = Intent (this@HomeFragment.context, ScoutActivity::class.java)
            startActivity(intent)
        }

    }



}


