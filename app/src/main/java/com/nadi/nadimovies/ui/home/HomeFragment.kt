package com.nadi.nadimovies.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.nadi.nadimovies.databinding.FragmentHomeBinding
import com.nadi.nadimovies.domain.movie.Movie
import com.nadi.nadimovies.ui.home.HomeAdapter.MoviesViewType.NORMAL
import com.nadi.nadimovies.ui.home.HomeAdapter.MoviesViewType.PAGER
import kotlinx.coroutines.ExperimentalCoroutinesApi


//@AndroidEntryPoint
@ExperimentalCoroutinesApi
class HomeFragment : Fragment(), HomeAdapter.OnMovieClickListener {
    private val viewModel: HomeViewModel by lazy {
        ViewModelProvider(this).get(HomeViewModel::class.java)
    }

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private lateinit var HomeAdapter: HomeAdapter
    private lateinit var upcomingMoviesAdapter: HomeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater)

        upcomingMoviesAdapter = HomeAdapter(PAGER, this)
        HomeAdapter = HomeAdapter(NORMAL, this)

        binding.nowPlayingRecycler.adapter = HomeAdapter
        binding.viewPager.adapter = upcomingMoviesAdapter

        viewModel.property.observe(viewLifecycleOwner, {
            HomeAdapter.submitList(it.results)
        })

        viewModel.property.observe(viewLifecycleOwner, {
            upcomingMoviesAdapter.submitList(it.results)
        })


//        binding.nowPlayingRecycler.adapter = HomeAdapter(HomeAdapter.OnClickListener {
//            navigateToMovieDetails(it)
//        })

        return binding.root
    }

    private fun navigateToMovieDetails(movie: Movie.Result) {
        this.findNavController()
            .navigate(HomeFragmentDirections.actionHomeFragmentToDetailsFragment(movie))
    }

    override fun onMovieItemClick(movie: Movie.Result) {
        navigateToMovieDetails(movie)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}

