package com.example.games.main.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.fragment.app.Fragment
import com.example.games.R
import com.example.games.databinding.ActivityMainBinding
import com.example.games.favorite.ui.FavoriteFragment
import com.example.games.home.ui.HomeFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val homeFragment = HomeFragment()
    private val favoriteFragment = FavoriteFragment()

    private var activeFragment: Fragment = homeFragment
    private val fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initFragment()
        setNavigationToolbar()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }
    private fun initFragment() {
        fragmentManager.beginTransaction().apply {
            add(R.id.navHostFragment, favoriteFragment, getString(R.string.favorite)).hide(
                favoriteFragment
            )
            add(R.id.navHostFragment, homeFragment, getString(R.string.home))
        }.commit()
    }

    private fun setNavigationToolbar() {
        binding.bottomNavigationToolbar.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.action_home -> {
                    fragmentManager.beginTransaction().hide(activeFragment).show(homeFragment)
                        .commit()
                    activeFragment = homeFragment
                    supportActionBar?.title = "Games"
                    return@setOnItemSelectedListener true
                }
                R.id.action_favorite -> {
                    fragmentManager.beginTransaction().hide(activeFragment).show(favoriteFragment)
                        .commit()
                    activeFragment = favoriteFragment
                    supportActionBar?.title = "Favorite"
                    return@setOnItemSelectedListener true
                }

            }
            return@setOnItemSelectedListener false
        }
    }
}
