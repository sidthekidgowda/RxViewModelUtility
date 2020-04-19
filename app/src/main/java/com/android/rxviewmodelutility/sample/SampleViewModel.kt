package com.android.rxviewmodelutility.sample

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.rxviewmodelutility.BaseRxViewModel
import com.android.rxviewmodelutility.SingleLiveEvent
import com.android.rxviewmodelutility.addSchedulers
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class SampleViewModel @Inject constructor(
    private val sampleInterface: SampleInterface
) : BaseRxViewModel() {

    private val _nameLiveData = MutableLiveData<String>()
    val nameLiveData: LiveData<String>
        get() = _nameLiveData

    private val _nextButtonClicked = SingleLiveEvent<Boolean>()
    val nextButtonClicked: LiveData<Boolean>
        get() = _nextButtonClicked

    fun getName() {
        addDisposable(
            Single.just(sampleInterface.provideName())
                .addSchedulers(Schedulers.io())
                .subscribe({
                    _nameLiveData.value = it
                }, {
                    Log.e("testViewModel", it.message)
                })
        )
    }

    fun buttonClick() {
        _nextButtonClicked.setValue(true)
    }
}