package com.tutorial.navigation.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.tutorial.navigation.R
import com.tutorial.navigation.databinding.FragmentViewTransactionBinding

class ViewTransactionFragment : Fragment() {

    private var _binding: FragmentViewTransactionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentViewTransactionBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
