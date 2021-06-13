package com.nadi.nadimovies.ui

import android.graphics.Rect
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.nadi.nadimovies.R
import com.nadi.nadimovies.databinding.ActivityMainBinding


//@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        supportNotchScreens()

    }

    private fun init() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment?
        val navController = navHostFragment!!.navController
        NavigationUI.setupWithNavController(binding.bottomNavigation, navController);

    }

    //I use this to support notch screens
    private fun supportNotchScreens(): Rect {
        val safeInsetRect = Rect()
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.P) {
            return safeInsetRect
        }
        val windowInsets = this.window.decorView.rootWindowInsets ?: return safeInsetRect
        val displayCutout = windowInsets.displayCutout
        if (displayCutout != null) {
            //getting SafeArea of screen
            safeInsetRect.set(
                displayCutout.safeInsetLeft,
                displayCutout.safeInsetTop,
                displayCutout.safeInsetRight,
                displayCutout.safeInsetBottom
            )
        }
        return safeInsetRect
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}