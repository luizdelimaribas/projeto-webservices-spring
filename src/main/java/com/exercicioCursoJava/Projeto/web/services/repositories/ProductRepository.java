package com.exercicioCursoJava.Projeto.web.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicioCursoJava.Projeto.web.services.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
