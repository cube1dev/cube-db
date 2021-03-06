package dev.cube1.cube.db.table

import org.jetbrains.exposed.dao.id.UUIDTable

object CubePlayers: UUIDTable() {
    val name = varchar("name", 36)
    val apiKey = varchar("api_key", 36)
}