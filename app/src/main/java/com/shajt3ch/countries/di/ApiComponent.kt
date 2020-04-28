package com.shajt3ch.countries.di

import com.shajt3ch.countries.model.CountriesService
import dagger.Component

/**
 * Created by Shakil Ahmed Shaj on 29,April,2020.
 * shakilahmedshaj@gmail.com
 */

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CountriesService)

}