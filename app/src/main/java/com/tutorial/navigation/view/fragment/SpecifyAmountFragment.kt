package com.tutorial.navigation.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs

import com.tutorial.navigation.databinding.FragmentSpecifyAmountBinding
import com.tutorial.navigation.model.DataModel

class SpecifyAmountFragment : Fragment() {

    private lateinit var binding: FragmentSpecifyAmountBinding
    private lateinit var navController: NavController
    private lateinit var dataModel: DataModel
    private lateinit var args: SpecifyAmountFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSpecifyAmountBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        args = arguments?.let { SpecifyAmountFragmentArgs.fromBundle(it) }!!
        binding.txtName.text = args.dataModel?.name.toString().trim()
        binding.btnSave.setOnClickListener {
            var name: String = args.dataModel?.name.toString().trim()
            val amount: String = binding.inputAmount.text.toString().trim()
            if(!amount.isEmpty()) {
                dataModel = DataModel(name, amount)
                navController.navigate(SpecifyAmountFragmentDirections.actionSpecifyAmountFragmentToConfirmFragment(dataModel))
            } else {
                Toast.makeText(activity, "Requred field!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
