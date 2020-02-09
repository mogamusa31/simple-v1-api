package tokyo.masayuki.simplev1api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleV1ApiApplication

fun main(args: Array<String>) {
	runApplication<SimpleV1ApiApplication>(*args)
}
