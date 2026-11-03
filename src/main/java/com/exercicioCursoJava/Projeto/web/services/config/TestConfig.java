package com.exercicioCursoJava.Projeto.web.services.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.exercicioCursoJava.Projeto.web.services.entities.Category;
import com.exercicioCursoJava.Projeto.web.services.entities.Order;
import com.exercicioCursoJava.Projeto.web.services.entities.User;
import com.exercicioCursoJava.Projeto.web.services.entities.enums.OrderStatus;
import com.exercicioCursoJava.Projeto.web.services.repositories.CategoryRepository;
import com.exercicioCursoJava.Projeto.web.services.repositories.OrderRepository;
import com.exercicioCursoJava.Projeto.web.services.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        User u3 = new User(null, "Bob Grey", "Bobgrey@gmail.com", "966666666", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.DELIVERED, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, u1);
        Order o4 = new Order(null, Instant.parse("2019-06-11T19:10:07Z"), OrderStatus.WAITING_PAYMENT, u3);
        Order o5 = new Order(null, Instant.parse("2019-08-19T03:40:10Z"), OrderStatus.CANCELED, u3);
        Order o6 = new Order(null, Instant.parse("2019-09-23T15:13:22Z"), OrderStatus.PAID, u3);

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        userRepository.saveAll(Arrays.asList(u1, u2, u3));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5, o6));
    }
}
