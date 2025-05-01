package com.kaiobrunobm.collectionstasks.tasks.data


enum class DaypartType {
    MORNING, AFTERNOON, EVENING
}


data class Event(
    val title: String,
    val description: String? = null,
    val daypart: DaypartType,
    val duration: Int,
)

val events = mutableListOf<Event>(
    Event(
        title = "Study Kotlin",
        description = "Commit to studying Kotlin at least 15 minutes per day.",
        daypart = DaypartType.EVENING,
        duration = 15
    ), Event(
        title = "Wake up",
        description = "Time to get up",
        daypart = DaypartType.MORNING,
        duration = 0
    ), Event(
        title = "Eat breakfast", daypart = DaypartType.MORNING, duration = 15
    ), Event(
        title = "Learn about Kotlin", daypart = DaypartType.AFTERNOON, duration = 30
    ), Event(
        title = "Practice Compose", daypart = DaypartType.AFTERNOON, duration = 60
    ), Event(
        title = "Watch latest DevBytes video", daypart = DaypartType.AFTERNOON, duration = 10
    ), Event(
        title = "Check out latest Android Jetpack library",
        daypart = DaypartType.EVENING,
        duration = 45
    )
)

val Event.durationOfEvent: String
    get() = if (this.duration < 60) {
        "short"
    } else {
        "long"
    }
