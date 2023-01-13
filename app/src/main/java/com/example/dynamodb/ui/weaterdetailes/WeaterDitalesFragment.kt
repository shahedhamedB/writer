package com.example.dynamodb.ui.weaterdetailes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.dynamodb.R
import com.example.dynamodb.core.base.BaseFragment
import com.example.dynamodb.core.onClick
import com.example.dynamodb.databinding.FragmentWhetherDetailesBinding
import com.example.dynamodb.ui.homewether.HomeViewModel

import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class WeaterDitalesFragment : BaseFragment() {

    lateinit var binding: FragmentWhetherDetailesBinding

    private val viewModel by viewModels<WeaterDetailesViewModel>()



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWhetherDetailesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.dynamodbModual = arguments?.getParcelable(KEY)
        StetUpLayout()

    }

    private fun StetUpLayout() {
        binding.backArrow.onClick {
            findNavController().popBackStack()
        }
        binding.title.text= viewModel.dynamodbModual!!.name
        binding.date.text=viewModel.dynamodbModual!!.created_at
        binding.price.text=viewModel.dynamodbModual!!.price
        Glide.with(this).load(viewModel.dynamodbModual!!.image_urls[0])
            .error(R.drawable.ic_gamerizrsplash).into(
                binding.image
            )
    }

    companion object {
        var KEY = ""

    }


}