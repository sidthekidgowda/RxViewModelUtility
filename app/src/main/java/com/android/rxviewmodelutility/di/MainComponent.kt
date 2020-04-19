package com.android.rxviewmodelutility.di

import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityModule::class,
        ViewModelModule::class
    ]
)
interface MainComponent {

}