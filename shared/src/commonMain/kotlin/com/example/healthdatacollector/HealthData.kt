// In shared/src/commonMain/kotlin/com/example/healthdatacollector/model/HealthData.kt
package com.example.healthdatacollector.model

data class HealthData(
    val timestamp: Long,
    val type: HealthDataType,
    val value: Double,
    val unit: String
)

enum class HealthDataType {
    HEART_RATE,
    BLOOD_PRESSURE_SYSTOLIC,
    BLOOD_PRESSURE_DIASTOLIC,
    BODY_TEMPERATURE,
    BLOOD_OXYGEN
}