package com.rogo.base.presentation.splash

import android.os.Bundle
import com.rogo.base.R
import com.rogo.base.databinding.FragmentSplashBinding
import com.vn.rogo.base.core.base.BaseFragment
import kotlinx.coroutines.*

class SplashFragment : BaseFragment<FragmentSplashBinding>(R.layout.fragment_splash) {

    override fun initControls(savedInstanceState: Bundle?) {
        super.initControls(savedInstanceState)

        CoroutineScope(Dispatchers.Main).launch {
            delay(2000)
            withContext(Dispatchers.Main) {
                safeNav(
                    R.id.splashFragment,
                    SplashFragmentDirections.actionSplashFragmentToHomeFragment()
                )

            }
        }
    }
}