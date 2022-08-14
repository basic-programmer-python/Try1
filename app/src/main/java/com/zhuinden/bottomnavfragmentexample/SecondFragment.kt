package com.zhuinden.bottomnavfragmentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.zhuinden.bottomnavfragmentexample.databinding.SecondFragmentBinding
import com.zhuinden.bottomnavfragmentexample.utils.viewBinding

class SecondFragment: Fragment(R.layout.second_fragment) {
    private val binding by viewBinding(SecondFragmentBinding::bind)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.button.setOnClickListener {
            Toast.makeText(this.context, "Pressed in 2ed", Toast.LENGTH_LONG).show()
            (parentFragment as RootFragment).try23("123".toInt())
        }
    }
}