package com.exercicioCursoJava.Projeto.web.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicioCursoJava.Projeto.web.services.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
