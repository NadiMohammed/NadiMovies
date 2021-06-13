package com.nadi.nadimovies.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.nadi.nadimovies.databinding.SearchFragmentBinding

class SearchFragment : Fragment() {
    private val viewModel: SearchViewModel by lazy {
        ViewModelProvider(this).get(SearchViewModel::class.java)
    }

    private var _binding: SearchFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = SearchFragmentBinding.inflate(inflater)

        init()

        return binding.root
    }

    private fun init() {
        binding.search.setOnClickListener {
            binding.search.isIconified = false
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}