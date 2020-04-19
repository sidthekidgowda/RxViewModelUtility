package com.android.rxviewmodelutility

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.rxviewmodelutility.sample.SampleViewModel
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var sampleViewModel: SampleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sampleViewModel = ViewModelProvider(this, viewModelFactory).get(SampleViewModel::class.java)
        sampleViewModel.nameLiveData.observe(this, Observer {
            name.text = it
        })
    }

    override fun onResume() {
        super.onResume()
        sampleViewModel.getName()

    }

    override fun onPause() {
        super.onPause()
        name.text = ""
        sampleViewModel.clearDisposables()
    }
}
