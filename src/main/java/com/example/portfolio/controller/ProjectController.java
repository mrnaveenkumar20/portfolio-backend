package com.example.portfolio.controller;

import com.example.portfolio.model.Project;
import com.example.portfolio.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller to expose endpoints for project data.
 */
@RestController
@RequestMapping("/api/projects")
// Allow requests from the frontend which runs on a different origin during development
@CrossOrigin(origins = "*") 
public class ProjectController {

    private final ProjectService projectService;

    // Dependency injection via constructor
    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    /**
     * Handles GET requests to /api/projects
     * @return A list of all portfolio projects.
     */
    @GetMapping
    public List<Project> getAllProjects() {
        return projectService.getProjects();
    }
}