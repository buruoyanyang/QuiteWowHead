package com.github.buruoyanyang.quitewowhead.services

import com.intellij.openapi.project.Project
import com.github.buruoyanyang.quitewowhead.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
