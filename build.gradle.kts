plugins {
    `java-library`

    id("dev.architectury.loom") version "1.7.+"
}

group = "dev.isxander"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    minecraft("com.mojang:minecraft:1.21.1")
    mappings(loom.officialMojangMappings())

    include(project(":child"))
}
