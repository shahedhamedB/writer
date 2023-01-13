package com.example.dynamodb.ui.homewether

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dynamodb.R
import com.example.dynamodb.core.base.BaseFragment
import com.example.dynamodb.databinding.FragmentHomeBinding
import com.example.dynamodb.ui.weaterdetailes.WeaterDitalesFragment
import com.example.dynamodb.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import androidx.navigation.fragment.findNavController
@AndroidEntryPoint
class HomeFragment : BaseFragment() {
    lateinit var binding: FragmentHomeBinding
    private val viewModel by viewModels<HomeViewModel>()

    lateinit var adapter: HomeAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupObservers()


    }

    private fun setupObservers() {
        val layoutManager = LinearLayoutManager(context)
        binding.recycler.layoutManager = layoutManager
        viewModel.getDynamodbWriterStatus()
        viewModel.getDynamodbWriterStatus.observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Resource.Status.SUCCESS -> {
                    Log.d("res", it.data!!.results.toString())

                    adapter = HomeAdapter(it.data!!.results!!) { pos, item ->
                        findNavController().navigate(
                           R.id.action_homeFragment_to_weaterDitalesFragment
                           , bundleOf(Pair(WeaterDitalesFragment.KEY, item!!))
                        )


                    }
                    binding.recycler.adapter = adapter
                    adapter.notifyDataSetChanged()

                }
                Resource.Status.ERROR -> {

                    Log.d("res", it.message.toString())


                }


                else -> {}
            }


        })


    }


}






