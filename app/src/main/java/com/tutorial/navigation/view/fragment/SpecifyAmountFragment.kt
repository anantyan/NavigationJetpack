package com.tutorial.navigation.view.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.tutorial.navigation.R

import com.tutorial.navigation.databinding.FragmentSpecifyAmountBinding
import com.tutorial.navigation.model.DataModel
import com.tutorial.navigation.view.activity.TryActivity

class SpecifyAmountFragment : Fragment() {

    private var _binding: FragmentSpecifyAmountBinding? = null
    private val binding get() = _binding!!
    private lateinit var dataModel: DataModel
    private val args: SpecifyAmountFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSpecifyAmountBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtName.text = args.dataModel?.name.toString().trim()
        binding.btnSave.setOnClickListener {
            var name: String = args.dataModel?.name.toString().trim()
            val amount: String = binding.inputAmount.text.toString().trim()
            if(!amount.isEmpty()) {
                dataModel = DataModel(name, amount)
                val destination = SpecifyAmountFragmentDirections.actionSpecifyAmountFragmentToConfirmFragment(dataModel)
                it.findNavController().navigate(destination)
            } else {
                Toast.makeText(activity, "Requred field!", Toast.LENGTH_SHORT).show()
            }
        }
        binding.btnSave.setOnLongClickListener {
            var name: String = args.dataModel?.name.toString().trim()
            val amount: String = binding.inputAmount.text.toString().trim()
            if(!amount.isEmpty()) {
                dataModel = DataModel(name, amount)
                /*navController.navigate(SpecifyAmountFragmentDirections.actionSpecifyAmountFragmentToViewBalanceFragment())*/ // jika menggunakan navigation jetpack
                val intent = Intent(activity, TryActivity::class.java) // jika menggunakan intent
                intent.putExtra("DATA_MODEL", dataModel)
                startActivity(intent)
                Toast.makeText(activity, "$name $amount", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(activity, "Requred field!", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
