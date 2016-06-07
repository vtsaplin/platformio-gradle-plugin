package com.tsaplin.gradle.platformio

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

import static org.junit.Assert.assertTrue

class PluginImplTest {

    @Test
    public void greeterPluginAddsGreetingTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'com.tsaplin.platformio'

        assertTrue(project.tasks.hello instanceof GreetingToFileTask)
    }
}
