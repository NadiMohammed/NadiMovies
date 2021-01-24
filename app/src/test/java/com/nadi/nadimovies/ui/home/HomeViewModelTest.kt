package com.nadi.nadimovies.ui.home

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

@ExperimentalCoroutinesApi
internal class HomeViewModelTest {
    @Mock
    private lateinit var testUseCases: TestUseCases

    private lateinit var homeViewModel: HomeViewModel

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        homeViewModel = HomeViewModel(testUseCases)
    }

    @Test
    fun `movieGetNowPlaying() then invoke getNowPlaying() from MovieGateway`() = runBlockingTest {
        try {

            testUseCases.invoke()

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}