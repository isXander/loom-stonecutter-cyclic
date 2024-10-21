plugins {
    id("fabric-loom") version "1.7.+" apply false
    id("dev.kikugie.stonecutter")
}
stonecutter active "1.21" /* [SC] DO NOT EDIT */

stonecutter registerChiseled tasks.register("chiseledBuild", stonecutter.chiseled) {
    group = "mod"
    ofTask("build")
}