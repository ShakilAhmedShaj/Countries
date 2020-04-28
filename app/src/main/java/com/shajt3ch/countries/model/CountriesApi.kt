package com.shajt3ch.countries.model

import io.reactivex.Single
import retrofit2.http.GET

/**
 * Created by Shakil Ahmed Shaj on 29,April,2020.
 * shakilahmedshaj@gmail.com
 */
interface CountriesApi {

    @GET("ShakilAhmedShaj/static_json_apis/master/countriesV2.json")
    fun getCountries(): Single<List<Country>>
}