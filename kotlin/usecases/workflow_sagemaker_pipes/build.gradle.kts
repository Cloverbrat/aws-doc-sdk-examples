import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
}

group = "me.scmacdon"
version = "1.0-SNAPSHOT"

buildscript {
    repositories {
        maven("https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath("org.jlleitschuh.gradle:ktlint-gradle:10.3.0")
    }
}

repositories {
    mavenCentral()
    jcenter()
}
apply(plugin = "org.jlleitschuh.gradle.ktlint")
dependencies {
    implementation("aws.sdk.kotlin:sagemaker-jvm:0.21.3-beta")
    implementation("aws.sdk.kotlin:sagemakergeospatial-jvm:0.21.3-beta")
    implementation("aws.sdk.kotlin:iam-jvm:0.21.3-beta")
    implementation("aws.sdk.kotlin:sqs-jvm:0.21.3-beta")
    implementation("aws.sdk.kotlin:lambda-jvm:0.21.3-beta")
    implementation("aws.sdk.kotlin:s3-jvm:0.21.3-beta")
    implementation("com.googlecode.json-simple:json-simple:1.1.1")
    implementation("com.google.code.gson:gson:2.10")
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}
