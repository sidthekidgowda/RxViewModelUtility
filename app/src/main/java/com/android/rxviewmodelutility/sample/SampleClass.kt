package com.android.rxviewmodelutility.sample

import javax.inject.Inject

class SampleClass @Inject constructor() : SampleInterface {

    override fun provideName(): String {
        return "Sample Class RxViewModel"
    }
}