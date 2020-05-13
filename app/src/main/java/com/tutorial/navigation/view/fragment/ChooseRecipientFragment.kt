package com.tutorial.navigation.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.tutorial.navigation.R
import com.tutorial.navigation.databinding.FragmentChooseRecipientBinding
import com.tutorial.navigation.model.DataModel

class ChooseRecipientFragment : Fragment() {

    private lateinit var binding: FragmentChooseRecipientBinding
    private lateinit var navController: NavController
    private lateinit var dataModel: DataModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChooseRecipientBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        binding.btnSave.setOnClickListener {
            val name: String = binding.inputName.text.toString().trim()
            if(!name.isEmpty()) {
                dataModel = DataModel(name, "")
                navController.navigate(ChooseRecipientFragmentDirections.actionChooseRecipientFragmentToSpecifyAmountFragment(dataModel))
            } else {
                Toast.makeText(activity, "Requred field!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
