package com.tutorial.navigation.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController

import com.tutorial.navigation.R
import com.tutorial.navigation.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnTransaction.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainFragment_to_viewTransactionFragment)
        }
        binding.btnSend.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainFragment_to_chooseRecipientFragment)
        }
        binding.btnBalance.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainFragment_to_viewBalanceFragment)
        }
        binding.btnTry.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainFragment_to_tryActivity)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
