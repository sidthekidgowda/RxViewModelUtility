package com.android.rxviewmodelutility.sample

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.rxviewmodelutility.BaseRxViewModel
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
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
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    _nameLiveData.value = it
                }, {
                    Log.e("testViewModel", it.message)
                })
        )
    }
}