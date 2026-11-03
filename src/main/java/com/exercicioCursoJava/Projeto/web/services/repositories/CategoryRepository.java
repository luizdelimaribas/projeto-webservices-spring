package com.exercicioCursoJava.Projeto.web.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicioCursoJava.Projeto.web.services.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
