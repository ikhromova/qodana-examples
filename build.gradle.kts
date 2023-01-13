import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
    application
}
group = "org.jetbrains.teamcity.qodana"
version = "v1.0-eap"

repositories {
    mavenCentral()
}
dependencies {
    implementation("net.sf.saxon:Saxon-HE:10.6")
    testImplementation(kotlin("test-junit"))
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
application {
    mainClassName = "MainKt"
}