package com.epam.deltix.gradle.plugins.velocity

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by PastushenyaV on 7/25/2016.
 */
class VelocityPlugin implements Plugin<Project> {

    void apply(Project project) {
        def velocity = project.container(VelocityEntry)
        project.extensions.velocity = velocity

        project.afterEvaluate({
            for (VelocityEntry entry in velocity) {
                VelocityTask task = project.tasks.create("vpp" + entry.name, VelocityTask)

                task.from = entry.from
                task.to = entry.to
                task.setContexts(entry.contexts)

                project.tasks.getByName('compileJava').dependsOn(task)
            }
        })
    }

}