package org.antailyaqwer.recipebookv2.di.components

import dagger.Component
import org.antailyaqwer.recipebookv2.di.modules.ApplicationModule
import org.antailyaqwer.recipebookv2.di.modules.DatabaseRepositoryModule
import javax.inject.Singleton

@Component(modules = [DatabaseRepositoryModule::class, ApplicationModule::class])
@Singleton
interface AppComponent {
}