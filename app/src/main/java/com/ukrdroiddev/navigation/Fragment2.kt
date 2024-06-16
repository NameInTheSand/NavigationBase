package com.ukrdroiddev.navigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ukrdroiddev.navigation.databinding.Fragment2Binding

class Fragment2 : Fragment(R.layout.fragment_2) {

    private var _binding: Fragment2Binding? = null
    private val binding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = Fragment2Binding.bind(view)
        binding.btnNavigateUp.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}