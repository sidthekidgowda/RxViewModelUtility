package com.android.rxviewmodelutility.sample

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.rxviewmodelutility.BaseRxViewModel
import io.reactivex.Single
import javax.inject.Inject

class SampleViewModel @Inject constructor(
    private val sampleInterface: SampleInterface
) : BaseRxViewModel() {

    private val _nameLiveData = MutableLiveData<String>()
    val nameLiveData: LiveData<String>
        get() = _nameLiveData

    fun getName() {
        addDisposable(
            Single.just(sampleInterface.provideName())
                .subscribe({
                    _nameLiveData.value = it
                }, {
                    Log.e("testViewModel", it.message)
                })
        )
    }
}