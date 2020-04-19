package com.android.rxviewmodelutility.sample

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class SampleViewModel @Inject constructor(
    private val sampleInterface: SampleInterface
) : ViewModel() {

    fun getName(): String {
        return sampleInterface.provideName()
    }
}