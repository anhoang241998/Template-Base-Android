package com.rogo.base.representation.common

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding


open class BaseActivity<T : ViewDataBinding> constructor(
    @LayoutRes val layoutId: Int
) : AppCompatActivity(), Initialization {


    /**
     * [DataBindingComponent] is generatved during compilation
     */
    protected var bindingComponent: DataBindingComponent? = DataBindingUtil.getDefaultComponent()

    /** A backing field for providing an immutable [binding] property.  */
    private var _binding: T? = null

    /**
     * A data-binding property will be initialized in [onCreateView].
     * And provide the inflated view which depends on [layoutId].
     */
    protected val binding: T
        get() = checkNotNull(_binding) {
            "Fragment $this binding cannot be accessed before onCreateView() or after onDestroyView()"
        }

    protected inline fun binding(block: T.() -> Unit): T {
        return binding.apply(block)
    }

    /**
     * Inflate [layoutId]
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView(this, layoutId, bindingComponent)
        initControls(savedInstanceState)
        initEvents()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding?.unbind()
        _binding = null
    }
}