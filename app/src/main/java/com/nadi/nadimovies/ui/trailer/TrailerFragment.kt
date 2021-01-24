package com.nadi.nadimovies.ui.trailer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import com.nadi.nadimovies.databinding.FragmentTrailerBinding
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi

@AndroidEntryPoint
@ExperimentalCoroutinesApi
class TrailerFragment : DialogFragment() {
    val viewModel: TrailerViewModel by lazy {
        ViewModelProvider(this).get(TrailerViewModel::class.java)
    }

    private lateinit var binding: FragmentTrailerBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTrailerBinding.inflate(inflater)
        binding.lifecycleOwner = viewLifecycleOwner

        val args = arguments?.let { TrailerFragmentArgs.fromBundle(it) }

        viewModel.getMovieTrailer(args!!.movieID)

        getVideoTrailer()

        return binding.root
    }

    private fun getVideoTrailer() {
        viewModel.property.observe(viewLifecycleOwner, {
            for (i in it.results) {
                binding.youtubePlayer.addYouTubePlayerListener(object :
                    AbstractYouTubePlayerListener() {
                    override fun onReady(youTubePlayer: YouTubePlayer) {
                        val videoId = it.results[0].key
                        youTubePlayer.loadVideo(videoId, 0f)
                    }
                })
            }
        })
    }


}
