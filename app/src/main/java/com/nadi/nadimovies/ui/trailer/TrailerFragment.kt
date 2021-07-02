package com.nadi.nadimovies.ui.trailer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.nadi.nadimovies.databinding.FragmentTrailerBinding
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class TrailerFragment : DialogFragment() {
    private val viewModel: TrailerViewModel by viewModels()

    private var _binding: FragmentTrailerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTrailerBinding.inflate(inflater)

        val args = arguments?.let { TrailerFragmentArgs.fromBundle(it) }

        viewModel.getMovieTrailer(args!!.movieID)

        getVideoTrailer()

        return binding.root
    }

    private fun getVideoTrailer() {
        lifecycleScope.launchWhenStarted {

            viewModel.property.collect {
                for (i in it.results) {
                    binding.youtubePlayer.addYouTubePlayerListener(object :
                        AbstractYouTubePlayerListener() {
                        override fun onReady(youTubePlayer: YouTubePlayer) {
                            val videoId = it.results[0].key
                            youTubePlayer.loadVideo(videoId, 0f)
                        }
                    })
                }
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
