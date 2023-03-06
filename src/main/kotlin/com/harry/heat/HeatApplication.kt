package com.harry.heat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HeatApplication

fun main(args: Array<String>) {
    runApplication<HeatApplication>(*args)
}
