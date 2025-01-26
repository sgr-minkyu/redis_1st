package com.example.movie.persistence.theater.entity

import com.example.movie.domain.theater.model.Theater
import com.example.movie.persistence.common.BaseEntity
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "theater")
class TheaterEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "theater_id", columnDefinition = "INT UNSIGNED")
    val id: Long = 0,

    val name: String,
) : BaseEntity() {
    companion object {
        fun from(theater: Theater)=  TheaterEntity(
            id = theater.id,
            name = theater.name,
        ).apply {
            createdBy = theater.createdBy
            createdAt = theater.createdAt
            updatedBy = theater.updatedBy
            updatedAt = theater.updatedAt
        }
    }

    fun toDomain(): Theater {
        return Theater(
            id = id,
            name = name,
            createdBy = createdBy,
            createdAt = createdAt,
            updatedBy = updatedBy,
            updatedAt = updatedAt
        )
    }
}