package com.example.security1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.security1.model.User;

// JpaRepository가 CRUD
public interface UserRepository extends JpaRepository<User, Integer>{

}
