plugins {
    `java-library`

    id("fabric-loom")
}

group = "dev.isxander"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    minecraft("com.mojang:minecraft:1.21.1")
    mappings(loom.officialMojangMappings())

    implementation(project(rootProject.path, "namedElements"))
}
