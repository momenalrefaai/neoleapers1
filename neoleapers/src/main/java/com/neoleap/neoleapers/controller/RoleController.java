package com.neoleap.neoleapers.controller;

import com.neoleap.neoleapers.model.Role;
import com.neoleap.neoleapers.services.RoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoleController {


    private RoleService role;

    @GetMapping("/roles")
    public List<Role> getAllRoles (){

        return role.getAllRoles();
    }
}
