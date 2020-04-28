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
            Country("CountryA"),
            Country("CountryB"),
            Country("CountryC"),
            Country("CountryD"),
            Country("CountryE"),
            Country("CountryF"),
            Country("CountryG"),
            Country("CountryH"),
            Country("CountryI"),
            Country("CountryJ"),
            Country("CountryK"),
            Country("CountryL"),
            Country("CountryM"),
            Country("CountryN"),
            Country("CountryO"),
            Country("CountryP"),
            Country("CountryQ"),
            Country("CountryR"),
            Country("CountryS"),
            Country("CountryT")
        )
        countryLoadError.value = false
        loading.value = false
        countries.value = mockData
    }


}

