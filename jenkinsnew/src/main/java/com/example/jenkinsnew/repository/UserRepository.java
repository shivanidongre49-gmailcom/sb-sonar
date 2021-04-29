package com.example.jenkinsnew.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jenkinsnew.model.User;

public interface UserRepository  extends JpaRepository<User, Integer>{

}
