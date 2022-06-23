package com.neoleap.neoleapers.services;

import com.neoleap.neoleapers.model.Role;
import com.neoleap.neoleapers.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {


    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    public List<Role> getAllRoles () {

        return  roleRepository.findAll();
    }
}
