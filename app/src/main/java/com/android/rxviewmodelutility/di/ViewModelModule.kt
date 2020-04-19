package com.android.rxviewmodelutility.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.android.rxviewmodelutility.ViewModelFactory
import com.android.rxviewmodelutility.ViewModelKey
import com.android.rxviewmodelutility.sample.SampleClass
import com.android.rxviewmodelutility.sample.SampleInterface
import com.android.rxviewmodelutility.sample.SampleViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(SampleViewModel::class)
    abstract fun providesSampleViewModel(viewModel: SampleViewModel): ViewModel

    @Binds
    abstract fun providesSampleClass(sampleClass: SampleClass): SampleInterface

    @Binds
    abstract fun providesViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}