package org.antailyaqwer.recipebookv2.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import org.antailyaqwer.recipebookv2.data.repositories.DatabaseRepository
import org.antailyaqwer.recipebookv2.data.repositories.impl.DatabaseRepositoryImpl
import org.antailyaqwer.recipebookv2.di.components.AppComponent
import javax.inject.Singleton

@Module(includes = [AppComponent::class])
class DatabaseRepositoryModule {

    @Provides
    @Singleton
    fun provideDatabaseRepository(context: Context): DatabaseRepository =
        DatabaseRepositoryImpl(context)
}