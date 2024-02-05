package com.jwt.example.service;

import com.jwt.example.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class UserService {

    private List<User>  store = new ArrayList<>();

    public UserService() {
       store.add(new User(UUID.randomUUID().toString(),"harsh","abc"));
        store.add(new User(UUID.randomUUID().toString(),"anup","xyz"));
        store.add(new User(UUID.randomUUID().toString(),"ravi","efg"));
    }
    public List<User> getUser(){
        return this.store;
    }
}
