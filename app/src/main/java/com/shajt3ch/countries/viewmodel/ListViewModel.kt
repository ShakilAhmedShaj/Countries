package com.shajt3ch.countries.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shajt3ch.countries.model.Country

/**
 * Created by Shakil Ahmed Shaj on 26,April,2020.
 * shakilahmedshaj@gmail.com
 */
class ListViewModel : ViewModel() {

    val countries = MutableLiveData<List<Country>>()
    val countryLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        fetchCountries()

    }

    private fun fetchCountries() {
        loading.value = true
        val mockData = listOf(
            Country("Country A"),
            Country("Country B"),
            Country("Country C"),
            Country("Country D"),
            Country("Country E"),
            Country("Country F"),
            Country("Country G"),
            Country("Country H"),
            Country("Country I"),
            Country("Country J"),
            Country("Country K"),
            Country("Country L"),
            Country("Country M"),
            Country("Country N"),
            Country("Country O"),
            Country("Country P"),
            Country("Country Q"),
            Country("Country R"),
            Country("Country S"),
            Country("Country T")
        )
        countryLoadError.value = false
        loading.value = false
        countries.value = mockData
    }


}

