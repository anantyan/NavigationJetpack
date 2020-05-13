package com.tutorial.navigation.view.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs

import com.tutorial.navigation.R
import com.tutorial.navigation.databinding.FragmentConfirmBinding

class ConfirmFragment : Fragment() {

    private lateinit var binding: FragmentConfirmBinding
    private val args: ConfirmFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentConfirmBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(activity, args.dataModel.toString().trim(), Toast.LENGTH_LONG).show()
    }
}
