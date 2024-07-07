package com.ukrdroiddev.navigation

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ukrdroiddev.navigation.databinding.Fragment1Binding
import kotlin.random.Random

class Fragment1 : Fragment(R.layout.fragment_1) {

    private var _binding: Fragment1Binding? = null
    private val binding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = Fragment1Binding.bind(view)
        binding.btnNavigate.setOnClickListener {
            findNavController().navigate(
                R.id.action_fragment_1_to_fragment_2,
                bundleOf("counter" to Random.nextInt(100))
            )
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}