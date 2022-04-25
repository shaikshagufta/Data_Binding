package com.example.databinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.viewModels
import com.example.databinding.databinding.FragmentPersonBinding


class PersonFragment : Fragment(R.layout.fragment_person) {

    lateinit var binding: FragmentPersonBinding
    private val viewModel: PersonViewModel by viewModels()

    /*override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_person, container, false)
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_person, container, false)
        return binding.root
    }*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentPersonBinding.bind(view)
        //dependency injection
        binding.viewModel = viewModel
        binding.lifecycleOwner = this//specifying the life cycle owner
        //binding.person= Person("hello person", 33, R.drawable.ic_emoji)
    }
}