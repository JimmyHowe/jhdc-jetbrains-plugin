package com.github.jimmyhowe.jhdcjetbrainsplugin.services

import com.intellij.openapi.project.Project
import com.github.jimmyhowe.jhdcjetbrainsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
