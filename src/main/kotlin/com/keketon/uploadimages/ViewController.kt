package com.keketon.uploadimages

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ViewController {
    @GetMapping
    fun get(
        model: Model
    ): String {
        model.addAttribute("message", "yuyuton!")
        return "index"
    }

}