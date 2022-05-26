package dev.cube1.cube.db.table

import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.Table

object Coops: Table() {
    val player = reference("player", CubePlayers)
    val cube = reference("cube", Cubes)

    override val primaryKey = PrimaryKey(player, cube)
}