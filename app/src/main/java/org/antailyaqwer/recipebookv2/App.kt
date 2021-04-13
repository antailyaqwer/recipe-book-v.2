package org.antailyaqwer.recipebookv2

import android.app.Application
import org.antailyaqwer.recipebookv2.di.components.AppComponent
import org.antailyaqwer.recipebookv2.di.components.DaggerAppComponent
import org.antailyaqwer.recipebookv2.di.modules.ApplicationModule

class App : Application() {

    lateinit var appComponent:AppComponent
    private set

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }
}