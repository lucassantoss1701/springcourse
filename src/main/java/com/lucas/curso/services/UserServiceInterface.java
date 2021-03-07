package com.lucas.curso.services;

import com.lucas.curso.entities.User;

import java.util.List;

public interface UserServiceInterface {
    List<User> findAll();
    User findById(Long id);
}
