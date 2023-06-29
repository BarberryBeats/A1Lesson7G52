package com.example.a1lesson7g52

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a1lesson7g52.FirstFragment.Companion.KEY_FOR_PASSWORD
import com.example.a1lesson7g52.FirstFragment.Companion.KEY_FOR_USERNAME
import com.example.a1lesson7g52.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        getArgument()
        initView()


    }

    private fun initView() {



    }

    private fun getArgument() {
        arguments?.apply {
            val user = getSerializable(KEY_FOR_PASSWORD) as User
            binding.apply {
                tvPassword.text = user.password
                tvUsername.text = user.username
            }
        }


    }


}