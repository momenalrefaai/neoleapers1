package com.neoleap.neoleapers.services;

import com.neoleap.neoleapers.model.User;
import com.neoleap.neoleapers.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> getAllUsers () {

        return  userRepository.findAll();
    }
}
