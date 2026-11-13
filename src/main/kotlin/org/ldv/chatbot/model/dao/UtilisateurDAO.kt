package org.ldv.chatbot.model.dao

import org.ldv.chatbot.model.entity.Utilisateur
import org.springframework.data.jpa.repository.JpaRepository

interface UtilisateurDAO : JpaRepository<Utilisateur, Long> {

    fun findByEmail(email: String): Utilisateur?

}
