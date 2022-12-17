package com.example.core.repository

import com.example.core.network.service.ApiServices
import com.example.core.remote.malFormedDetailResponse
import com.example.core.remote.validDetailResponse
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import okhttp3.OkHttpClient
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import com.google.common.truth.Truth.assertThat

class RepositoryImplTest {

    private lateinit var repository: GamesRepositoryImpl
    private lateinit var mockWebServer: MockWebServer
    private lateinit var okHttpClient: OkHttpClient
    private lateinit var api:ApiServices

    @Before
    fun setUp() {
        mockWebServer = MockWebServer()
        okHttpClient = OkHttpClient.Builder()
            .writeTimeout(1, TimeUnit.SECONDS)
            .readTimeout(1, TimeUnit.SECONDS)
            .connectTimeout(1, TimeUnit.SECONDS)
            .build()
        api = Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .client(okHttpClient)
            .baseUrl(mockWebServer.url("/"))
            .build()
            .create(ApiServices::class.java)
        repository = GamesRepositoryImpl(
            dao = mockk(relaxed = true),
            api = api
        )
    }

    @After
    fun tearDown() {
        mockWebServer.shutdown()
    }

    @Test
    fun `Detail games, valid response, returns results`() = runBlocking {
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(200)
                .setBody(validDetailResponse)
        )
        val result = repository.getDetail(2454)

        assertThat(result.isSuccess).isTrue()
    }

    @Test
    fun `Detail games, invalid response, returns failure`() = runBlocking {
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(403)
                .setBody(validDetailResponse)
        )
        val result = repository.getDetail(2454)

        assertThat(result.isFailure).isTrue()
    }

    @Test
    fun `Detail games, malformed response, returns failure`() = runBlocking {
        mockWebServer.enqueue(
            MockResponse()
                .setBody(malFormedDetailResponse)
        )
        val result = repository.getDetail(2454)

        assertThat(result.isFailure).isTrue()
    }

}
