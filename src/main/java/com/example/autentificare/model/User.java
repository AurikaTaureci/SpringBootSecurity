package com.example.autentificare.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private String password;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    @JsonManagedReference  // se pune pe legaturile @OneToMany()
    private List<Authority> authorityList;

    @OneToMany(mappedBy = "coordinator")
    @JsonManagedReference
    private List<Project> projectList;
}
