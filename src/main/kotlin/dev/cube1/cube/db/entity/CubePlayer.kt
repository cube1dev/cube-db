package dev.cube1.cube.db.entity

import dev.cube1.cube.db.table.CubePlayers
import dev.cube1.cube.db.table.Cubes
import dev.cube1.cube.db.table.StarredCubes
import org.jetbrains.exposed.dao.*
import org.jetbrains.exposed.dao.id.EntityID
import java.util.UUID

class CubePlayer(id: EntityID<UUID>): UUIDEntity(id) {
    companion object: UUIDEntityClass<CubePlayer>(CubePlayers)

    var name by CubePlayers.name
    var starred by Cube via StarredCubes
}