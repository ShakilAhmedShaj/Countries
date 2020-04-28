package com.shajt3ch.countries.model

import com.shajt3ch.countries.di.DaggerApiComponent
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by Shakil Ahmed Shaj on 29,April,2020.
 * shakilahmedshaj@gmail.com
 */
class CountriesService {


    @Inject
    lateinit var api: CountriesApi

    init {
        DaggerApiComponent.create().inject(this)
    }

    fun getCountries(): Single<List<Country>> {

        return api.getCountries()
    }


}