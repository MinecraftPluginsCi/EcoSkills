group = "com.willfp"
version = rootProject.version

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.19.3-R0.1-SNAPSHOT")
    compileOnly("com.github.ben-manes.caffeine:caffeine:3.2.0")

    implementation("com.willfp:ecomponent:1.4.1")
}

tasks {
    build {
        dependsOn(publishToMavenLocal)
    }
}
