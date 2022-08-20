package com.example.networkcall.restapi

import com.example.networkcall.feature_dictionary.data.remote.dto.WordInfoDto
import retrofit2.http.GET
import retrofit2.http.Url

interface RestApiService {

    @ResponseFormat(Format.JSON)
    @GET
    suspend fun getWordInfo(@Url fullUrl: String): List<WordInfoDto>
}