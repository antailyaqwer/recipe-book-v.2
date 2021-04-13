package org.antailyaqwer.recipebookv2

import android.app.Application
import org.antailyaqwer.recipebookv2.di.components.AppComponent

class App : Application() {

    lateinit var AppComponent:AppComponent
    private set

    override fun onCreate() {
        super.onCreate()

    }
}