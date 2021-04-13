package org.antailyaqwer.recipebookv2.di.modules

import dagger.Module
import dagger.Provides
import org.antailyaqwer.recipebookv2.data.repositories.NetworkRepository
import org.antailyaqwer.recipebookv2.data.repositories.impl.NetworkRepositoryImpl
import javax.inject.Singleton

@Module()
class NetworkRepositoryModule {

    @Provides
    @Singleton
    fun provideNetworkRepository():NetworkRepository = NetworkRepositoryImpl()

}