package dev.cube1.cube.db.table

import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.Database

object Cubes: IntIdTable() {
    val name = varchar("name", 50)
    val containerId = varchar("container_id", 50)
    val owner = reference("owner", CubePlayers)
    val category = varchar("category", 50)

    val isPublic = integer("is_public")
}