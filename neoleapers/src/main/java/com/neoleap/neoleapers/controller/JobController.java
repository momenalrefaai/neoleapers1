package com.neoleap.neoleapers.controller;

import com.neoleap.neoleapers.model.Country;
import com.neoleap.neoleapers.model.Job;
import com.neoleap.neoleapers.services.CountryService;
import com.neoleap.neoleapers.services.JobService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JobController {


    private JobService job;

    @GetMapping("/jobs")
    public List<Job> getAllJobs (){

        return job.getAllJobs();
    }
}
