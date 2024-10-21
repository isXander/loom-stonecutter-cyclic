plugins {
    `java-library`

    id("fabric-loom")
}

group = "dev.isxander"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val parentNode = stonecutter.node.sibling("")!!
val parentProject = parentNode.project

dependencies {
    minecraft("com.mojang:minecraft:1.21.1")
    mappings(loom.officialMojangMappings())

    implementation(project(parentProject.path, "namedElements"))
}
