package org.antailyaqwer.recipebookv2.di.components

import dagger.Component
import org.antailyaqwer.recipebookv2.di.modules.DatabaseRepositoryModule
import javax.inject.Singleton

@Component(modules = [DatabaseRepositoryModule::class])
@Singleton
interface AppComponent {
}