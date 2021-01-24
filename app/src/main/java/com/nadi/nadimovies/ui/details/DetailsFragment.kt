package com.nadi.nadimovies.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.nadi.core.movie.Movie
import com.nadi.nadimovies.R
import com.nadi.nadimovies.databinding.FragmentDetailsBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi

@AndroidEntryPoint
@ExperimentalCoroutinesApi
class DetailsFragment : Fragment() {

    private val nowPlayingResponse: DetailsFragmentArgs by navArgs()

    private val viewModel: DetailsViewModel by viewModels()

    private lateinit var binding: FragmentDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailsBinding.inflate(inflater)

        // Allows Data Binding to Observe LiveData with the lifecycle of this Fragment
        binding.lifecycleOwner = viewLifecycleOwner

        // Giving the binding access to the ViewModel
        binding.viewModel = viewModel


        binding.similarMoviesRecycler.adapter = SimilarAdapter(SimilarAdapter.OnClickListener {
            navigateToMovieSimilarDetails(it)
        })

        binding.playImg.setOnClickListener {
            Navigation.findNavController(requireView())
                .navigate(DetailsFragmentDirections.actionDetailsFragmentToTrailerFragment(viewModel.selectedMovie.value!!.id!!))
        }

        return binding.root
    }

    private fun navigateToMovieSimilarDetails(movie: Movie.Result) {
        val bundle = bundleOf("MovieResult" to movie)

        requireView().findNavController()
            .navigate(R.id.action_detailsFragment_self, bundle)
    }


}