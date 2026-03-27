package com.example.lab5_6_bookapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lab5_6_bookapp.databinding.FragmentChapterBinding
import java.io.File

class ChapterFragment : Fragment() {
    private var _binding: FragmentChapterBinding?=null
    private val binding get()=_binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding= FragmentChapterBinding.inflate(inflater,container,false)
        ch1()
        binding.ch1Bttn.setOnClickListener {
            ch1()
        }

        binding.ch2Bttn.setOnClickListener {
            ch2()
        }

        binding.ch3Bttn.setOnClickListener {
            ch3()
        }
        binding.ch4Bttn.setOnClickListener {
            ch4()
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun ch1(){
        val contents=requireContext().assets.open(  "Chapter1.txt").bufferedReader().use{
            it.readText()
        }
        binding.titleTxtView.text="Chapter 1 - Playing Pilgrims"
        binding.storyTxtView.text=contents
    }
    private fun ch2(){
        val contents=requireContext().assets.open(  "Chapter2.txt").bufferedReader().use{
            it.readText()
        }
        binding.titleTxtView.text="Chapter 2 - A Merry Christmas"
        binding.storyTxtView.text=contents
    }
    private fun ch3(){
        val contents=requireContext().assets.open(  "Chapter3.txt").bufferedReader().use{
            it.readText()
        }
        binding.titleTxtView.text="Chapter 3 - The Laurence Boy"
        binding.storyTxtView.text=contents
    }
    private fun ch4(){
        val contents=requireContext().assets.open(  "Chapter4.txt").bufferedReader().use{
            it.readText()
        }
        binding.titleTxtView.text="Chapter 4 - Burdens"
        binding.storyTxtView.text=contents
    }
}