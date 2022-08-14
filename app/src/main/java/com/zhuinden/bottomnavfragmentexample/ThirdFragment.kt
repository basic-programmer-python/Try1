package com.zhuinden.bottomnavfragmentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.zhuinden.bottomnavfragmentexample.databinding.ThirdFragmentBinding
import com.zhuinden.bottomnavfragmentexample.utils.viewBinding
import org.w3c.dom.Text

class ThirdFragment: Fragment(R.layout.third_fragment) {
    private val binding by viewBinding(ThirdFragmentBinding::bind)
    fun try23(int: Int) {
        binding.button2.append(int.toString())
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.button2.setOnClickListener {
            Toast.makeText(this.context, "Pressed in 3ed", Toast.LENGTH_LONG).show()
        }
    }
}