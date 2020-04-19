package com.android.rxviewmodelutility

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.android.rxviewmodelutility.sample.SampleInterface
import com.android.rxviewmodelutility.sample.SampleViewModel
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class SampleViewModelTest {

    @get:Rule
    val testRule = InstantTaskExecutorRule()

    @get:Rule
    val rxRule = RxSchedulerRule()

    @Mock
    lateinit var sampleInterface: SampleInterface

    private lateinit var sampleViewModel: SampleViewModel

    @Before
    fun setup() {

        `when`(sampleInterface.provideName()).thenReturn("Hello World")

        sampleViewModel = SampleViewModel(sampleInterface)
    }

    @Test
    fun `test getName`() {
        sampleViewModel.getName()

        assertEquals("Hello World", sampleViewModel.nameLiveData.value)
    }

    @Test
    fun `test nextButton clicked`() {
        sampleViewModel.buttonClick()
        assertTrue(sampleViewModel.nextButtonClicked.value!!)
    }
}