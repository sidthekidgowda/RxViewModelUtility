package com.android.rxviewmodelutility

import com.android.rxviewmodelutility.di.DaggerMainComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class MainApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerMainComponent.create()
    }
}