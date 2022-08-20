package com.example.networkcall.test

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.networkcall.restapi.RestApiService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


private const val TAG = "TestViewModel"

@HiltViewModel
class TestViewModel @Inject constructor(
    private val restApiService: RestApiService
) : ViewModel() {
    fun testAPI(word: String) {
        viewModelScope.launch {
            Log.d(TAG, "========= word -> $word ==================")
            val url = "https://api.dictionaryapi.dev/api/v2/entries/en/$word"
            val response = restApiService.getWordInfo(url)
            Log.d(TAG, "response-> $response")
        }
    }
}