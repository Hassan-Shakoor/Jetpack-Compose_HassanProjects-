package com.hassan.quizmaster.di

import com.hassan.quizmaster.network.QuestionApi
import com.hassan.quizmaster.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import retrofit2.converter.gson.GsonConverterFactory
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideQuestionApi(): QuestionApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(QuestionApi::class.java)
    }
}