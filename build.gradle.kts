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
    implementation("com.atlassian.upm:bamboo-host-license-provider:1000.0.0.4-D20160902T203317")
    testImplementation(kotlin("test-junit"))
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}
application {
    mainClassName = "MainKt"
}