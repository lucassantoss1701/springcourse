package com.lucas.curso.services;

import com.lucas.curso.entities.User;
import com.lucas.curso.repositories.UserRepository;
import com.lucas.curso.services.interfaces.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;


@Service
public class UserService implements UserServiceInterface {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll(){
        return repository.findAll();
    }

    @Override
    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

}
