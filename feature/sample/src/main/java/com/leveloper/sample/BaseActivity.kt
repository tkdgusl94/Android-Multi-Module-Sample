package com.leveloper.sample

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.leveloper.common.base.BaseViewModel
import com.leveloper.common.base.EventObserver
import com.leveloper.common.ext.showToast

abstract class BaseActivity<T : ViewDataBinding, V : BaseViewModel>(@LayoutRes private val layoutResId: Int)
    : AppCompatActivity(layoutResId) {

    protected lateinit var binding: T
        private set

    protected abstract val vm: V

    protected abstract fun prepareActivity()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutResId)

        performDataBinding()
        prepareActivity()
        subscribeToLiveData()
    }

    open fun subscribeToLiveData() {
        vm.toast.observe(this, EventObserver {
            showToast(it)
        })
    }

    private fun performDataBinding() {
        binding.lifecycleOwner = this
        binding.executePendingBindings()
    }

    protected fun binding(action: T.() -> Unit) {
        binding.run(action)
    }
}