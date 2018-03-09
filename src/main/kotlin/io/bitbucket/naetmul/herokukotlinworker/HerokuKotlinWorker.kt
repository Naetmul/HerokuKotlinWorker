package io.bitbucket.naetmul.herokukotlinworker

import java.lang.Thread.sleep
import kotlin.concurrent.thread

fun main(args: Array<String>) {
    // Everything printed to STDOUT will be logged.
    println("Program Started.")

    // This is not a daemon thread.
    thread {
        var seconds = 0

        println("Thread Started.")
        while (true) {
            sleep(5000)
            seconds += 5
            println("$seconds seconds elapsed after the thread started.")
        }
    }

    // The program ends if all non-daemon threads end.
}