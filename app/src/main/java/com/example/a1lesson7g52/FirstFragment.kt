package com.example.a1lesson7g52

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.a1lesson7g52.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    companion object{
        const val KEY_FOR_USERNAME = "user"
        const val KEY_FOR_PASSWORD = "password"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            initListener()
    }

    private fun initListener() {
        binding.btnNext.setOnClickListener{
            findNavController().navigate(R.id.secondFragment, bundleOf(KEY_FOR_PASSWORD to User("Amir", "amir2002")))

        }
    }


}