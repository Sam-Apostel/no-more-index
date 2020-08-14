package com.github.sam-apostel.nomoreindex.services

import com.intellij.openapi.project.Project
import com.github.sam-apostel.nomoreindex.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
