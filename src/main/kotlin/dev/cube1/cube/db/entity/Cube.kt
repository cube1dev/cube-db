package dev.cube1.cube.db.entity

import dev.cube1.cube.db.table.Coops
import dev.cube1.cube.db.table.Cubes
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class Cube(id: EntityID<Int>): IntEntity(id) {
    companion object: IntEntityClass<Cube>(Cubes)

    var name by Cubes.name
    var owner by CubePlayer referencedOn Cubes.owner
    var containerId by Cubes.containerId
    var coop by CubePlayer via Coops

    var isPublic by Cubes.isPublic
}