package com.example.noteapp_hw_4_2.ui.fragments.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.noteapp_hw_4_2.databinding.FragmentOnBoardPagingBinding

class OnBoardPagingFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardPagingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
     binding = FragmentOnBoardPagingBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }
    private fun initialize() = with(binding){
        when(requireArguments().getInt(ARG_ONBOARD_POSITION)){
            0 ->{
                onTxt.text = "Удобный функционал"
            }
            1 -> {
                onTxt.text="Быстрый, качественный продукт"
            }
            2 -> {
                onTxt.text="Куча функций и интересных работ"
            }
        }
    }

    companion object{
        const val ARG_ONBOARD_POSITION = "onBoard"
    }

}