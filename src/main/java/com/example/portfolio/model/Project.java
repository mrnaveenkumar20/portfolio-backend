package com.example.portfolio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Represents a portfolio project.
 * Using Lombok to reduce boilerplate code.
 */
@Data // Generates getters, setters, toString(), etc.
@NoArgsConstructor // Generates a no-argument constructor
@AllArgsConstructor // Generates a constructor with all arguments
public class Project {

    private Long id;
    private String title;
    private String description;
    private String imageUrl;
    private List<String> technologies;
    private String githubUrl;
    private String liveUrl;

}
