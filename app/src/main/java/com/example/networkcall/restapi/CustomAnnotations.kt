package com.example.networkcall.restapi

enum class Format {
    JSON, XML
}

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class ResponseFormat(val value: Format)

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class RequestFormat(val value: Format)