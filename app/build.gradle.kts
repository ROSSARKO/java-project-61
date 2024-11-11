plugins {
    application
    distribution
    checkstyle
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
tasks.test {
    useJUnitPlatform()
}
application {
    mainClass = "hexlet.code.App"
}
