package com.rogo.base.representation.home

import android.os.Bundle
import android.util.Log
import com.rogo.base.MyApplication
import com.rogo.base.R
import com.rogo.base.databinding.HomeFragmentBinding
import com.rogo.base.representation.common.BaseFragment

class HomeFragment : BaseFragment<HomeFragmentBinding>(R.layout.home_fragment) {

    override fun initControls(savedInstanceState: Bundle?) {
        super.initControls(savedInstanceState)
        binding.swDarkMode.isChecked = (requireActivity().application as MyApplication).isDarkMode
        binding.swDarkMode.setOnCheckedChangeListener { _, isChecked ->
            Log.d("DarkModeChangeTAG", "initControls: $isChecked")
            commonViewModel.setDarkMode(isChecked, requireContext())
        }

    }

    override fun initEvents() {
        super.initEvents()

    }
}