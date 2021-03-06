package com.rogo.base.presentation

import android.content.Intent
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.rogo.base.R
import com.rogo.base.databinding.ActivityMainBinding
import com.vn.rogo.base.core.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private lateinit var navController: NavController

    override fun initEvents() {

    }

    override fun initControls(savedInstanceState: Bundle?) {
        navController = findNavController(R.id.main_fragment)
    }

    override fun navigateUpTo(upIntent: Intent?): Boolean {
        navController.navigateUp()
        return true
    }


}