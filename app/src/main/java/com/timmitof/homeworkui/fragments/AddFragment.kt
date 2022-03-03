package com.timmitof.homeworkui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.reginald.editspinner.EditSpinner
import com.timmitof.homeworkui.Constans
import com.timmitof.homeworkui.databinding.FragmentAddBinding

class AddFragment : Fragment() {
    private var _binding: FragmentAddBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddBinding.inflate(inflater, container, false)

        binding.toolbar.titleToolbar.text = "Новая заявка на кредит"

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val spinnerDistributionChannel = binding.distributionChannel
        val spinnerProvider = binding.provider

        adapterDistributionChannel(spinnerDistributionChannel, Constans.stringsForDistributionChannel)
        adapterProvider(spinnerProvider, Constans.stringsForProvider)
    }

    fun adapterDistributionChannel(spinner: EditSpinner, list: List<String>) {
        val adapter = ArrayAdapter(requireActivity(), android.R.layout.simple_spinner_item, list)
        spinner.setAdapter(adapter)
    }

    fun adapterProvider(spinner: EditSpinner, list: List<String>) {
        val adapter = ArrayAdapter(requireActivity(), android.R.layout.simple_spinner_item, list)
        spinner.setAdapter(adapter)
    }
}