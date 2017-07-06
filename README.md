# Spring Boot Multi-Project Gradle

This is an example project seeking to illustrate how you can create
robust multi-project environments using Gradle

# Multi-project builds

`settings.gradle` contains a list of all the sub projects

## build.gradle

`allprojects` block applies to all sub projects

each project is included via `project(":[project-name]")`

you can include subprojects in a project via `dependencies` like so:

```groovy
project(":boot-api") {
    dependencies {
        compile project(":boot-logger")
        // other dependencies
    }
}
```

# Running the application

In the project root directory, run:

```bash
./gradlew :boot-api:bootRun
```