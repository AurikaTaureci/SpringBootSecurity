package com.example.autentificare.repository;

import com.example.autentificare.model.Project;
import com.example.autentificare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

    public List<Project> findProjectsByCoordinator(User coordinator);
}
