package com.lucas.curso.resources;

import com.lucas.curso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Maria", "Maria@gmail.com", "19995776598", "1537928154");
        return ResponseEntity.ok().body(user);
    }

}
