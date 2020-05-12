package com.tutorial.navigation.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.tutorial.navigation.R
import com.tutorial.navigation.databinding.FragmentViewTransactionBinding

class ViewTransactionFragment : Fragment() {

    private lateinit var binding: FragmentViewTransactionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewTransactionBinding.inflate(layoutInflater, container,false)
        return binding.root
    }
}
