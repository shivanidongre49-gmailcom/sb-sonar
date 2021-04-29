package com.example.jenkinsnew.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jenkinsnew.model.User;
import com.example.jenkinsnew.repository.UserRepository;

@Service
public class UserService {
@Autowired
private UserRepository repository;

public User addUser(User user) {
	// TODO Auto-generated method stub
	return repository.save(user);
}

public List<User> getUsers() {
	// TODO Auto-generated method stub
	List<User> user=repository.findAll();
	System.out.println("GETTING DATA"+user);
	return user;
}

public void deleteUser(User user) {
	// TODO Auto-generated method stub
	repository.delete(user);
}
}

