package com.lambda.analytics.bestpracticechallenge.di

import com.lambda.analytics.bestpracticechallenge.MainActivity
import dagger.Component

@Component(modules = [MakeupMod::class])
interface MakeupCom {

    fun injection(mainActivity: MainActivity)

}