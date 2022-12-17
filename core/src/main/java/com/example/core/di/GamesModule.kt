package com.example.core.di

import android.app.Application
import androidx.room.Room
import com.example.core.local.GamesDatabase
import com.example.core.network.service.ApiServices
import com.example.core.repository.GamesRepository
import com.example.core.repository.GamesRepositoryImpl
import com.example.core.util.APIMOVIE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object GamesModule {
    @Provides
    @Singleton
    fun provideOkhttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(
                HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                }
            ).build()
    }

    @Provides
    @Singleton
    fun provideMoviesApi(client: OkHttpClient): ApiServices {
        return Retrofit.Builder()
            .baseUrl(APIMOVIE)
            .addConverterFactory(MoshiConverterFactory.create())
            .client(client)
            .build()
            .create()
    }
    @Provides
    @Singleton
    fun provideTrackerDatabase(app: Application): GamesDatabase {
        return Room.databaseBuilder(
            app,
            GamesDatabase::class.java,
            "games_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideMoviesRepository(
        api: ApiServices,
        db: GamesDatabase
    ): GamesRepository {
        return GamesRepositoryImpl(
            dao = db.dao,
            api = api
        )
    }
}