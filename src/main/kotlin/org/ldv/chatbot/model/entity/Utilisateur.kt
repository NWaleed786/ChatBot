package org.ldv.chatbot.model.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class Utilisateur(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,

    @Column(nullable = false)
    var nom: String,

    @Column(nullable = false, unique = true)
    var email: String,

    @Column(nullable = false)
    var motDePasse: String,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    var role: Role,

    var dateCreation: LocalDateTime = LocalDateTime.now()

)
