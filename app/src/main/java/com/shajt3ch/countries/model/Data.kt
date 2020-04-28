package com.shajt3ch.countries.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Shakil Ahmed Shaj on 26,April,2020.
 * shakilahmedshaj@gmail.com
 */

data class Country(
    @SerializedName("name")
    val countryName: String?,
    @SerializedName("capital")
    val capital: String?,
    @SerializedName("flagPNG")
    val flag: String?
)
 