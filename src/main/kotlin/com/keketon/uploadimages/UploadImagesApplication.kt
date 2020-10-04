package com.keketon.uploadimages

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping

@SpringBootApplication
class UploadImagesApplication

fun main(args: Array<String>) {
	runApplication<UploadImagesApplication>(*args)
}
