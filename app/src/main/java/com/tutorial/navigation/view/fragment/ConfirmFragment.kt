package com.tutorial.navigation.view.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.tutorial.navigation.R
import com.tutorial.navigation.databinding.FragmentConfirmBinding

class ConfirmFragment : Fragment() {

    private lateinit var binding: FragmentConfirmBinding
    private lateinit var args: ConfirmFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentConfirmBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        args = arguments?.let { ConfirmFragmentArgs.fromBundle(it) }!!
        Toast.makeText(activity, args.dataModel.toString().trim(), Toast.LENGTH_LONG).show()
    }
}
