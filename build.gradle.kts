plugins {
    `java-library`

    id("fabric-loom")
}

group = "dev.isxander"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val childNode = stonecutter.node.sibling("child")!!

dependencies {
    minecraft("com.mojang:minecraft:1.21.1")
    mappings(loom.officialMojangMappings())

    include(childNode.project)
}
