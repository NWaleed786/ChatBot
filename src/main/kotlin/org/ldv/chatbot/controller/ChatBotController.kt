package org.ldv.chatbot.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller
class ChatBotController {

    @GetMapping("/")
    fun accueil(): String {
        return "home"
    }

    @GetMapping("/login")
    fun connexion(): String {
        return "auth/login"
    }

    @PostMapping("/login")
    fun connecter(): String {
        return "redirect:/admin"
    }

    @GetMapping("/exemple")
    fun exemple(): String {
        return "exemple"
    }
}
