package dev.cube1.cube.db

import dev.cube1.cube.db.entity.Cube
import dev.cube1.cube.db.entity.CubePlayer
import dev.cube1.cube.db.table.Coops
import dev.cube1.cube.db.table.CubePlayers
import dev.cube1.cube.db.table.Cubes
import dev.cube1.cube.db.table.StarredCubes
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.SizedCollection
import org.jetbrains.exposed.sql.transactions.transaction

fun Database.setup() {
    transaction(this) {
        SchemaUtils.create(Cubes, Coops, CubePlayers, StarredCubes)

        val plr = CubePlayer.new {
            name = "R2turnTrue"
            starred = SizedCollection(listOf())
        }

        Cube.new {
            name = "테스트맵"
            coop = SizedCollection(listOf(plr))
            owner = plr
        }
    }
}