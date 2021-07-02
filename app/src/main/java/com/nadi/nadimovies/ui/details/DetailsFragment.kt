package com.nadi.nadimovies.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.nadi.nadimovies.R
import com.nadi.nadimovies.databinding.FragmentDetailsBinding
import com.nadi.nadimovies.domain.movie.Movie
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class DetailsFragment : Fragment(), SimilarAdapter.OnSimilarClickListener {

    private val viewModel: DetailsViewModel by viewModels()

    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!

    private lateinit var similarAdapter: SimilarAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailsBinding.inflate(inflater)

        init()
        observe()

        binding.playImg.setOnClickListener {
            navigateToTrailer()
        }

        return binding.root
    }

    private fun init() {
        similarAdapter = SimilarAdapter(this)

        binding.similarMoviesRecycler.adapter = similarAdapter
    }

    private fun observe() {

        lifecycleScope.launchWhenStarted {
            viewModel.offlineMovies.collect {
                similarAdapter.submitList(it)
                applyData()
            }
        }

        lifecycleScope.launchWhenStarted {
            viewModel.property.collect {
                similarAdapter.submitList(it.results)
                applyData()
            }

        }

    }

    private fun applyData() {
        binding.apply {

            viewModel.intentDataStore.apply {
                movieNameTxt.text = this.value!!.title

                Glide.with(requireContext())
                    .load("https://image.tmdb.org/t/p/w500${this.value!!.poster_path}")
                    .into(movieImg)

                releaseDateTxt.text = this.value!!.release_date

                rateTxt.text = this.value!!.vote_average.toString()

                overviewTxt.text = this.value!!.overview
            }

        }
    }


    private fun navigateToMovieSimilarDetails(movie: Movie.Result) {
        val bundle = bundleOf("movie" to movie)
        requireView().findNavController().navigate(R.id.action_detailsFragment_self, bundle)
    }

    private fun navigateToTrailer() {
        this.findNavController()
            .navigate(DetailsFragmentDirections.actionDetailsFragmentToTrailerFragment(viewModel.intentDataStore.value!!.id!!))
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onSimilarItemClick(movie: Movie.Result) {
        navigateToMovieSimilarDetails(movie)
    }

}