package com.exercicioCursoJava.Projeto.web.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicioCursoJava.Projeto.web.services.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
