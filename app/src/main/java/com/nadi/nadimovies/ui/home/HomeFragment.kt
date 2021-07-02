package com.nadi.nadimovies.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import com.nadi.nadimovies.R
import com.nadi.nadimovies.databinding.FragmentHomeBinding
import com.nadi.nadimovies.domain.movie.Movie
import com.nadi.nadimovies.ui.home.HomeAdapter.MoviesViewType.NORMAL
import com.nadi.nadimovies.ui.home.HomeAdapter.MoviesViewType.PAGER
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect


@ExperimentalCoroutinesApi
@AndroidEntryPoint
class HomeFragment : Fragment(), HomeAdapter.OnMovieClickListener {

    private val viewModel: HomeViewModel by viewModels()

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private lateinit var homeAdapter: HomeAdapter
    private lateinit var upcomingMoviesAdapter: HomeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater)

        init()
        observe()

        return binding.root
    }


    private fun init() {
        upcomingMoviesAdapter = HomeAdapter(PAGER, this)
        homeAdapter = HomeAdapter(NORMAL, this)

        binding.nowPlayingRecycler.adapter = homeAdapter
        binding.viewPager.adapter = upcomingMoviesAdapter


    }

    private fun observe() {
        lifecycleScope.launchWhenStarted {

            viewModel.offlineMovies.collect {

                when (it.isNullOrEmpty()) {
                    true -> {
                        homeAdapter.submitList(null)
                        upcomingMoviesAdapter.submitList(null)
                    }
                    false -> {
                        homeAdapter.submitList(it)
                        upcomingMoviesAdapter.submitList(it)
                    }
                }


            }
        }
        lifecycleScope.launchWhenStarted {

            viewModel.property.collect {

                when (it.results.isNullOrEmpty()) {
                    true -> {
                        homeAdapter.submitList(null)
                        upcomingMoviesAdapter.submitList(null)
                    }
                    false -> {
                        homeAdapter.submitList(it.results)
                        upcomingMoviesAdapter.submitList(it.results)
                    }
                }
            }
        }

    }


    private fun navigateToMovieDetails(movie: Movie.Result) {
        val bundle = bundleOf("movie" to movie)

        requireView().findNavController()
            .navigate(R.id.action_homeFragment_to_detailsFragment, bundle)
    }

    override fun onMovieItemClick(movie: Movie.Result) {
        navigateToMovieDetails(movie)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}

