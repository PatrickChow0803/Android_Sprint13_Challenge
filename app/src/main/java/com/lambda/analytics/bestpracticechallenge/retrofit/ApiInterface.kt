package com.lambda.analytics.bestpracticechallenge.retrofit

import com.lambda.analytics.bestpracticechallenge.model.Makeup
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface{

    @GET("products.json")
    fun getBrand(@Query ("brand") brand: String): Single<List<Makeup>>

}