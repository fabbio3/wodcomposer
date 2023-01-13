package it.fbb.wodcomposer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WodcomposerApplication

fun main(args: Array<String>) {
    runApplication<WodcomposerApplication>(*args)
}
