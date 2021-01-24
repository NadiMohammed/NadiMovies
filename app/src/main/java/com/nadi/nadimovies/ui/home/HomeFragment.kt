package com.nadi.nadimovies.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.nadi.core.movie.Movie
import com.nadi.nadimovies.R
import com.nadi.nadimovies.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi


@AndroidEntryPoint
@ExperimentalCoroutinesApi
class HomeFragment : Fragment(), HomeAdapter.OnMovieClickListener {
    private val viewModel: HomeViewModel by lazy {
        ViewModelProvider(this).get(HomeViewModel::class.java)
    }

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)

        // Allows Data Binding to Observe LiveData with the lifecycle of this Fragment
        binding.lifecycleOwner = viewLifecycleOwner

        // Giving the binding access to the HomeViewModel
        binding.viewModel = viewModel
        binding.viewPager.adapter = HomeAdapter(HomeAdapter.MoviesViewType.PAGER, this)
        binding.nowPlayingRecycler.adapter = HomeAdapter(HomeAdapter.MoviesViewType.NORMAL, this)

//        binding.nowPlayingRecycler.adapter = HomeAdapter(HomeAdapter.OnClickListener {
//            navigateToMovieDetails(it)
//        })

        return binding.root
    }


    private fun navigateToMovieDetails(movie: Movie.Result) {

        val bundle = bundleOf("MovieResult" to movie)
        requireView().findNavController()
            .navigate(R.id.action_homeFragment_to_detailsFragment, bundle)
    }

    override fun onMovieItemClick(movie: Movie.Result) {
        navigateToMovieDetails(movie)
    }
}

