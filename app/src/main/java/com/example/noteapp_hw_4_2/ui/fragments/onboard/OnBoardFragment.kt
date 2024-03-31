package com.example.noteapp_hw_4_2.ui.fragments.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import com.example.noteapp_hw_4_2.databinding.FragmentOnBoardBinding
import com.example.noteapp_hw_4_2.ui.adapter.OnBoardViewPagerAdapter

class OnBoardFragment : Fragment() {
    private lateinit var binding: FragmentOnBoardBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupListener()

    }

    private fun initialize() {
        binding.viewPager2.adapter = OnBoardViewPagerAdapter(this@OnBoardFragment)
    }

    private fun setupListener() = binding.viewPager2.apply {
        binding.viewPager2Btn.setOnClickListener {
            if (currentItem < 3)
                setCurrentItem(currentItem + 2, true)
        }
             if (currentItem < 2) {
                setCurrentItem(currentItem + 1, true)
        }
    }

}