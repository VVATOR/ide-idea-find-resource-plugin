package com.github.vvator.ideideafindresourceplugin.services

import com.github.vvator.ideideafindresourceplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
