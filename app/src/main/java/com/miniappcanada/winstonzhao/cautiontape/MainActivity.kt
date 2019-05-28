package com.miniappcanada.winstonzhao.cautiontape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
    when (item.itemId) {
        R.id.navigation_home -> {

            return@OnNavigationItemSelectedListener true
        }
        R.id.navigation_schedule -> {

            return@OnNavigationItemSelectedListener true
        }
        R.id.navigation_more -> {

            return@OnNavigationItemSelectedListener true
        }
    }
    false
}


class MainActivity : AppCompatActivity() {

    lateinit var toolbar: ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        toolbar = supportActionBar!!
        val bottomNavigation: BottomNavigationView = findViewById(R.id.navigationView)

        about_button.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }

        floatingScoutButton.setOnClickListener {
            val intent =Intent(this, ScoutActivity::class.java)
            startActivity(intent)
        }
    }
}
