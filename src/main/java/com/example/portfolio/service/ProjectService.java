package com.example.portfolio.service;

import com.example.portfolio.model.Project;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Arrays;

/**
 * Service layer to handle business logic related to projects.
 * In this version, it provides hardcoded mock data.
 */
@Service
public class ProjectService {

    // In a real application, this data would come from a database.
    private static final List<Project> MOCK_PROJECTS = Arrays.asList(
        new Project(
            1L,
            "E-commerce Platform",
            "A full-featured e-commerce platform with a RESTful API backend, product catalog, shopping cart, and user authentication.",
            "https://placehold.co/600x400/172a45/64ffda?text=E-Commerce",
            Arrays.asList("Java", "Spring Boot", "PostgreSQL", "React"),
            "https://github.com",
            "https://example.com"
        ),
        new Project(
            2L,
            "Task Management App",
            "A Kanban-style task management application that allows users to create, organize, and track their tasks across different boards.",
            "https://placehold.co/600x400/172a45/64ffda?text=Task+App",
            Arrays.asList("Java", "Spring WebFlux", "MongoDB", "Vue.js"),
            "https://github.com/Khidir-Karawita/task-management-app",
            "https://github.com/Khidir-Karawita/task-management-app"
        ),
        new Project(
            3L,
            "Real-time Chat Application",
            "A web-based chat application using WebSockets for real-time communication, supporting multiple rooms and private messaging.",
            "https://placehold.co/600x400/172a45/64ffda?text=Chat+App",
            Arrays.asList("Java", "Spring WebSocket", "RabbitMQ", "JavaScript"),
            "https://github.com",
            "https://example.com"
        ),
        new Project(
            4L,
            "URL Shortener Service",
            "A microservice that generates shortened URLs for long links, tracks click analytics, and provides a simple REST API.",
            "https://placehold.co/600x400/172a45/64ffda?text=URL+Shortener",
            Arrays.asList("Java", "Spring Boot", "Redis", "Docker"),
            "https://github.com",
            "https://example.com"
        ),
        new Project(
            5L,
            "Cloud Deployment Pipeline",
            "A CI/CD pipeline script to automate the build, test, and deployment of a Spring Boot application to AWS Elastic Beanstalk.",
            "https://placehold.co/600x400/172a45/64ffda?text=CI/CD",
            Arrays.asList("AWS", "Jenkins", "Maven", "Docker"),
            "https://github.com",
            "https://example.com"
        ),
        new Project(
            6L,
            "Portfolio Website API",
            "The very REST API that powers this portfolio website, built with Spring Boot to serve project data to the frontend.",
            "https://placehold.co/600x400/172a45/64ffda?text=This+API",
            Arrays.asList("Java", "Spring Boot", "Maven"),
            "https://github.com",
            "https://example.com"
        )
    );

    /**
     * Returns the list of mock projects.
     * @return a list of Project objects.
     */
    public List<Project> getProjects() {
        return MOCK_PROJECTS;
    }
}
