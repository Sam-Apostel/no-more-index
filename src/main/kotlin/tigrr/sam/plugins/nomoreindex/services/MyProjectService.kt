package tigrr.sam.plugins.nomoreindex.services

import tigrr.sam.plugins.nomoreindex.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
