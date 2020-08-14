package tigrr.sam.plugins.nomoreindex.services

import com.intellij.openapi.project.Project
import tigrr.sam.plugins.nomoreindex.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
