package com.example.networkcall.feature_dictionary.data.remote.dto

import com.google.gson.annotations.SerializedName

data class WordInfoDto(
    val license: LicenseDto,
    val meanings: List<MeaningDto>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val sourceUrls: List<String>,
    val word: String
)