package com.varun.newsappcompose.di

import com.varun.newsappcompose.repo.RemoteDS
import com.varun.newsappcompose.repo.RemoteDSImpl
import com.varun.newsappcompose.repo.Repo
import com.varun.newsappcompose.repo.RepoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepoModule {
    @Binds
    abstract fun bindRemoteDS(remoteDsImpl: RemoteDSImpl): RemoteDS

    @Binds
    abstract fun bindRepo(repoImpl: RepoImpl): Repo
}