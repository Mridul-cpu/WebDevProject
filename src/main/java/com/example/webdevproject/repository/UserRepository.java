package com.example.webdevproject.repository;

import com.example.webdevproject.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User , Integer>
{
    public Iterable<User> deleteByUsername(String username);    
    public User findByUsername(String username);
}
