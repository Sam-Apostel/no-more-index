package com.github.sam-apostel.nomoreindex.listeners

import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import com.github.sam-apostel.nomoreindex.services.MyProjectService

internal class MyProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        project.getService(MyProjectService::class.java)
    }
}
