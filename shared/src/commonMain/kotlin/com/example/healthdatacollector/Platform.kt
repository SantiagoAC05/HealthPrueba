package com.example.healthdatacollector

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform