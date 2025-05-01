package com.kaiobrunobm.collectionstasks.tasks.functions

import com.kaiobrunobm.collectionstasks.tasks.data.durationOfEvent
import com.kaiobrunobm.collectionstasks.tasks.data.events

val shortEvents = events.filter {
    it.duration < 60
}

val eventsGroupByDaypart = events.groupBy { it.daypart }

fun main() {
    events.forEach {
        println(it)
    }

    println()

    println(
        "You have ${shortEvents.size} short events"
    )

    println()

    eventsGroupByDaypart.forEach { event ->
        println(
            "${event.key}: ${event.value.size} events"
        )
    }

    println()

    println(events.last().title)

    println()

    println("Duration of first event of the day: ${events[0].durationOfEvent}")

}