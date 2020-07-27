package com.library_management_proper.demo.services.service_impl;

import com.library_management_proper.demo.models.User;
import com.library_management_proper.demo.repositories.UserRepository;
import com.library_management_proper.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Set<User> findAll() {
        Set<User> userSet = new HashSet<>();
        userRepository.findAll().forEach(userSet::add);
        return userSet;
    }

    @Override
    public User findById(Long aLong) {
        return null;
    }

    @Override
    public User save(User object) {
        return userRepository.save(object);
    }

    @Override
    public void delete(User object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
