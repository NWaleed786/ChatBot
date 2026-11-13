package org.ldv.chatbot.controller.admin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AdminController {

    @GetMapping("/admin")
    fun dashboard(): String {
        return "admin/dashboard"
    }

    @GetMapping("/admin/utilisateurs")
    fun utilisateurs(): String {
        return "admin/utilisateurs"
    }

    @GetMapping("/admin/statistiques")
    fun statistiques(): String {
        return "admin/statistiques"
    }

    @GetMapping("/admin/parametres")
    fun parametres(): String {
        return "admin/parametres"
    }
}