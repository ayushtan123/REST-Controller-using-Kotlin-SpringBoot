package org.ayspring.at11

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class At11Application

fun main(args: Array<String>) {
	runApplication<At11Application>(*args)
//    SpringApplication.run(At11Application::class.java, *args)
//    SpringApplication.run(T::class.java, *args)
}
