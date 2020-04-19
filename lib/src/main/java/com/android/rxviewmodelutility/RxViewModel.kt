package com.android.rxviewmodelutility

import io.reactivex.disposables.Disposable

interface RxViewModel {
    fun addDisposable(disposable: Disposable)
    fun removeDisposable(disposable: Disposable)
    fun clearDisposables()
}