package dev.cube1.cube.db.table

import org.jetbrains.exposed.sql.Table

object StarredCubes: Table() {
    val cube = reference("cube", Cubes)
    val player = reference("player", CubePlayers)

    override val primaryKey: PrimaryKey = PrimaryKey(cube, player)
}