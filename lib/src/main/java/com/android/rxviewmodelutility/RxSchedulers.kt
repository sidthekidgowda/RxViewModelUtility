package com.android.rxviewmodelutility

import io.reactivex.*
import io.reactivex.android.schedulers.AndroidSchedulers

fun <T> Single<T>.addUpstreamScheduler(upstreamScheduler: Scheduler): Single<T> {
    return subscribeOn(upstreamScheduler)
}

fun <T> Single<T>.addUIScheduler(): Single<T> {
    return observeOn(AndroidSchedulers.mainThread())
}

fun <T> Single<T>.addSchedulers(upstreamScheduler: Scheduler): Single<T> {
    return addUpstreamScheduler(upstreamScheduler)
        .addUIScheduler()
}

fun <T> Observable<T>.addUpstreamScheduler(upstreamScheduler: Scheduler): Observable<T> {
    return subscribeOn(upstreamScheduler)
}

fun <T> Observable<T>.addUIScheduler(): Observable<T> {
    return observeOn(AndroidSchedulers.mainThread())
}

fun <T> Observable<T>.addSchedulers(upstreamScheduler: Scheduler): Observable<T> {
    return addUpstreamScheduler(upstreamScheduler)
        .addUIScheduler()
}

fun <T> Flowable<T>.addUpstreamScheduler(upstreamScheduler: Scheduler): Flowable<T> {
    return subscribeOn(upstreamScheduler)
}

fun <T> Flowable<T>.addUIScheduler(): Flowable<T> {
    return observeOn(AndroidSchedulers.mainThread())
}

fun <T> Flowable<T>.addSchedulers(upstreamScheduler: Scheduler): Flowable<T> {
    return addUpstreamScheduler(upstreamScheduler)
        .addUIScheduler()
}

fun Completable.addUpstreamScheduler(upstreamScheduler: Scheduler): Completable {
    return subscribeOn(upstreamScheduler)
}

fun Completable.addUIScheduler(): Completable {
    return observeOn(AndroidSchedulers.mainThread())
}

fun Completable.addSchedulers(upstreamScheduler: Scheduler): Completable {
    return addUpstreamScheduler(upstreamScheduler)
        .addUIScheduler()
}
