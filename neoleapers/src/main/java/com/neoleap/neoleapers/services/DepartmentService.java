package com.neoleap.neoleapers.services;

import com.neoleap.neoleapers.model.Department;
import com.neoleap.neoleapers.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {


    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }


    public List<Department> getAllDepartments () {

        return  departmentRepository.findAll();
    }
}
