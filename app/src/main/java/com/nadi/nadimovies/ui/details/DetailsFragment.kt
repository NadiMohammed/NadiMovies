package com.nadi.nadimovies.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.nadi.nadimovies.databinding.FragmentDetailsBinding
import com.nadi.nadimovies.domain.movie.Movie
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect

@ExperimentalCoroutinesApi
class DetailsFragment : Fragment(), SimilarAdapter.OnSimilarClickListener {

    private val viewModel: DetailsViewModel by lazy {
        val movie = DetailsFragmentArgs.fromBundle(requireArguments()).movie
        val factory = MovieDetailsViewModelFactory(movie)
        ViewModelProvider(this, factory).get(DetailsViewModel::class.java)
    }

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
            viewModel.movie.apply {

                movieNameTxt.text = this.title

                Glide.with(requireContext())
                    .load("https://image.tmdb.org/t/p/w500${this.poster_path}")
                    .into(movieImg)

                releaseDateTxt.text = this.release_date

                rateTxt.text = this.vote_average.toString()

                overviewTxt.text = this.overview
            }
        }
    }


    private fun navigateToMovieSimilarDetails(movie: Movie.Result) {
        this.findNavController()
            .navigate(DetailsFragmentDirections.actionDetailsFragmentSelf(movie))
    }

    private fun navigateToTrailer() {
        this.findNavController()
            .navigate(DetailsFragmentDirections.actionDetailsFragmentToTrailerFragment(viewModel.movie.id!!))
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onSimilarItemClick(movie: Movie.Result) {
        navigateToMovieSimilarDetails(movie)
    }

}