package com.android.rxviewmodelutility.di

import com.android.rxviewmodelutility.MainApplication
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityModule::class,
        ViewModelModule::class
    ]
)
interface MainComponent : AndroidInjector<MainApplication>