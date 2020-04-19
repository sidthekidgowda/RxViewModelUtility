package com.android.rxviewmodelutility

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BaseRxViewModel : ViewModel(), RxViewModel {
    private val compositeDisposable = CompositeDisposable()

    override fun addDisposable(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    override fun removeDisposable(disposable: Disposable) {
        compositeDisposable.remove(disposable)
    }

    override fun clearDisposables() {
        compositeDisposable.clear()
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}