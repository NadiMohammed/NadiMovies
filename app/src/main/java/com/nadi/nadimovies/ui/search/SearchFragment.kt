package com.nadi.nadimovies.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.nadi.nadimovies.databinding.SearchFragmentBinding
import com.nadi.nadimovies.domain.search.SearchResults
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect

@ExperimentalCoroutinesApi
class SearchFragment : Fragment(), SearchAdapter.OnSearchClickListener {

    private val viewModel: SearchViewModel by lazy {
        ViewModelProvider(this).get(SearchViewModel::class.java)
    }

    private var _binding: SearchFragmentBinding? = null
    private val binding get() = _binding!!

    private lateinit var searchAdapter: SearchAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = SearchFragmentBinding.inflate(inflater)

        init()
        observe()

        return binding.root
    }

    private fun init() {
        searchAdapter = SearchAdapter(this)

        binding.searchRecycler.adapter = searchAdapter

        binding.search.setOnClickListener {
            binding.search.isIconified = false
        }

        binding.search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {

            override fun onQueryTextChange(newText: String): Boolean {
                viewModel.searchMovie(newText)
                return false
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                viewModel.searchMovie(query)
                return false
            }

        })

    }

    private fun observe() {
        lifecycleScope.launchWhenStarted {
            viewModel.movie.collect {

                when (it.results.isNullOrEmpty()) {
                    true -> {
                        searchAdapter.submitList(null)
                    }
                    false -> {
                        searchAdapter.submitList(it.results)
                    }
                }

            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onSearchItemClick(search: SearchResults) {
        Toast.makeText(requireContext(), "You Click On ${search.title}", Toast.LENGTH_LONG).show()
    }


}