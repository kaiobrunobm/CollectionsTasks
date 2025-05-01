package com.kaiobrunobm.collectionstasks.taskOne.data

enum class DaypartType {
    MORNING, AFTERNOON, EVENING
}


data class Event<DaypartType> (
    val title: String,
    val description: String?,
    val daypart: DaypartType,
    val duration: Int
)

val Events = listOf(
    Event(
        title = "Study Kotlin",
        description = "Commit to studying Kotlin at least 15 minutes per day.",
        daypart = DaypartType.EVENING,
        duration = 15
    )
)