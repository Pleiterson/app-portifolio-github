package br.com.appportifoliogithub

import android.app.Application
import br.com.appportifoliogithub.data.di.DataModule
import br.com.appportifoliogithub.domain.di.DomainModule
import br.com.appportifoliogithub.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}