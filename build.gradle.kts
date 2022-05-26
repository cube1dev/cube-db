plugins {
    kotlin("jvm") version "1.6.10"
    `maven-publish`
}

group = "dev.cube1"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.exposed:exposed-dao:0.38.2")
    implementation("org.jetbrains.exposed:exposed-jdbc:0.38.2")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "dev.cube1"
            artifactId = project.name
            version = project.version as String

            from(components["java"])
        }
    }
}