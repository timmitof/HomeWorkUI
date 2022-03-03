package com.timmitof.homeworkui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.synnapps.carouselview.ImageListener
import com.timmitof.homeworkui.Constans
import com.timmitof.homeworkui.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.toolbar.titleToolbar.text = "Главная"

        binding.carouselView.pageCount = Constans.imagesArray.size
        binding.carouselView.setImageListener(imageListener)

        return binding.root
    }

    var imageListener =
        ImageListener { position, imageView -> imageView.setImageResource(Constans.imagesArray[position]) }
}