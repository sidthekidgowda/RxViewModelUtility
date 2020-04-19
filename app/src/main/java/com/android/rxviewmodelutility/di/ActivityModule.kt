package com.android.rxviewmodelutility.di

import com.android.rxviewmodelutility.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun providesMainActivity(): MainActivity
}