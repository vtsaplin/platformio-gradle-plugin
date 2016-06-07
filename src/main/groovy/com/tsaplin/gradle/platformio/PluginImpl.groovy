package com.tsaplin.gradle.platformio

import org.gradle.api.Plugin
import org.gradle.api.Project

class PluginImpl implements Plugin<Project> {
    void apply(Project project) {
        project.tasks.create('hello', GreetingToFileTask)
    }
}
