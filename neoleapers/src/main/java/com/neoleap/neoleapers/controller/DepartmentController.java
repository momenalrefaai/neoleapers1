package com.neoleap.neoleapers.controller;

import com.neoleap.neoleapers.model.Department;
import com.neoleap.neoleapers.services.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentController {


    private DepartmentService department;

    @GetMapping("/departments")
    public List<Department> getAllDepartments (){

        return department.getAllDepartments();
    }
}
