package com.leveloper.sample

import androidx.activity.viewModels
import com.leveloper.feature.sample.R
import com.leveloper.feature.sample.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(R.layout.activity_main) {

    override val vm: MainViewModel by viewModels()

    override fun prepareActivity() {
        binding.vm = vm

        binding.btn.setOnClickListener {
            vm.addSample()
        }
    }
}
