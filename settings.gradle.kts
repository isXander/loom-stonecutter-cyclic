pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()

        maven("https://maven.fabricmc.net")

        // Arch Loom
        maven("https://maven.architectury.dev")
        maven("https://maven.neoforged.net/releases/")
        maven("https://maven.minecraftforge.net/")
    }
}

include("child")

rootProject.name = "loom-test"

