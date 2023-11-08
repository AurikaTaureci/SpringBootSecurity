package com.example.autentificare.service;

import com.example.autentificare.model.Project;
import com.example.autentificare.model.User;
import com.example.autentificare.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository  projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getProjectsByCoordinator(User coordinator){
        return projectRepository.findProjectsByCoordinator(coordinator);
    }
}
