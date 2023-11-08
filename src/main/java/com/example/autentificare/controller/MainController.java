package com.example.autentificare.controller;

import com.example.autentificare.model.Project;
import com.example.autentificare.model.User;
import com.example.autentificare.service.ProjectService;
import com.example.autentificare.service.UserService;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/api")
public class MainController {

    private final ProjectService projectService;
    private final UserService userService;

    public MainController(ProjectService projectService, UserService userService) {
        this.projectService = projectService;
        this.userService = userService;
    }

    @GetMapping("/get/{username}")
    public List<Project> getProjectsByCoordonator1(@PathVariable String username) throws Exception {
        final User user =userService.findUserByUsername(username);
        return projectService.getProjectsByCoordinator(user);

    }

    @GetMapping("/projects")
    public String getProjectsByCoordonator(Model model, Authentication authentication) throws Exception {

        final User user =userService.findUserByUsername(authentication.getName());
        model.addAttribute("loggedInUser",authentication.getName());
        model.addAttribute("projects", projectService.getProjectsByCoordinator(user));
        return "projects.html";

    }
}
