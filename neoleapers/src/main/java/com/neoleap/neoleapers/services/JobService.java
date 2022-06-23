package com.neoleap.neoleapers.services;

import com.neoleap.neoleapers.model.Job;
import com.neoleap.neoleapers.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {


    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }


    public List<Job> getAllJobs () {

        return  jobRepository.findAll();
    }
}
