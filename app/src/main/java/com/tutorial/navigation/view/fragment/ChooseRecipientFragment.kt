package com.tutorial.navigation.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.tutorial.navigation.databinding.FragmentChooseRecipientBinding
import com.tutorial.navigation.model.DataModel
import com.tutorial.navigation.view.activity.MainActivity

class ChooseRecipientFragment : Fragment() {

    private var _binding: FragmentChooseRecipientBinding? = null
    private val binding get() = _binding!!
    private lateinit var dataModel: DataModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentChooseRecipientBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSave.setOnClickListener {
            val name: String = binding.inputName.text.toString().trim()
            if(name.isNotEmpty()) {
                dataModel = DataModel(name, "")
                val destination = ChooseRecipientFragmentDirections.actionChooseRecipientFragmentToSpecifyAmountFragment(dataModel)
                it.findNavController().navigate(destination)
            } else {
                Toast.makeText(activity, "Requred field!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
