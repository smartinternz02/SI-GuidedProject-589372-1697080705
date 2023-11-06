package com.varun.newsappcompose.activities

import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import com.varun.newsappcompose.activities.BaseActivity
import com.varun.newsappcompose.states.HomeState
import com.varun.newsappcompose.ui.screen.HomeScreen
import com.varun.newsappcompose.viewmodels.HomeVM
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : BaseActivity<HomeVM, HomeState>() {
    override val viewModel: HomeVM by viewModels()

    @Composable
    override fun Content() {
        HomeScreen(viewModel)
    }
}