package com.codegym.serviece.user;

import com.codegym.model.User;
import com.codegym.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class UserServiece implements IUserServiece{
    @Autowired
    UserRepository userRepository;


    @Override
    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public void save(User model) {
        userRepository.save(model);
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(id);
    }
}
