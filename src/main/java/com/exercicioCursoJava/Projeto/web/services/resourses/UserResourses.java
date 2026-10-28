package com.exercicioCursoJava.Projeto.web.services.resourses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercicioCursoJava.Projeto.web.services.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResourses {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "maria@gmail.com", "988888888", "12345");
        return ResponseEntity.ok().body(u);
    }

}
