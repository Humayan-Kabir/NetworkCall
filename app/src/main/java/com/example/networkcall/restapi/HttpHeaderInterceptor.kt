package com.example.networkcall.restapi

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import retrofit2.Invocation
import javax.inject.Inject

class HttpHeaderInterceptor @Inject constructor() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        chain.request().apply {
            val newRequest = newBuilder().apply {
                //TODO add headers here
            }.build()
            return chain.proceed(newRequest)
        }
    }
}

fun <T : Annotation> Request.getCustomAnnotation(annotationClass: Class<T>): T? =
    this.tag(Invocation::class.java)?.method()?.getAnnotation(annotationClass)