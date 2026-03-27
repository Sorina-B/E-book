package com.example.lab5_6_bookapp

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lab5_6_bookapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding?=null
    private val binding get()=_binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding= FragmentHomeBinding.inflate(inflater,container,false)
        binding.textView.text= buildString {
            append("\"Little Women\" by Louisa May Alcott is a coming-of-age novel published in 1868-1869. ")
            append("   The story follows the four March sisters—Meg, Jo, Beth, and Amy—as they navigate their passage from childhood")
            append(" to womanhood in Civil War-era Massachusetts. Loosely based on Alcott's own family, the novel explores themes ")
            append("of domesticity, work, and true love while depicting the sisters' struggles with genteel poverty, their ")
            append("father's absence as a Union Army chaplain, and their journey toward individual identity in nineteenth-century America")
        }

        binding.StartReadingBttn.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, ChapterFragment())
                .addToBackStack(null)
                .commit()

        }


        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}