package com.mrlonis.example_kotlin_spring_maven_app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExampleKotlinSpringMavenAppApplication

fun main(args: Array<String>) {
	runApplication<ExampleKotlinSpringMavenAppApplication>(*args)
}
