package sam.tigrr.plugins.nomoreindex.services

import com.intellij.openapi.project.Project
import sam.tigrr.plugins.nomoreindex.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
