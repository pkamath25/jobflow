package com.pranamya.jobtracker.service;

import com.pranamya.jobtracker.entity.ApplicationStatus;
import com.pranamya.jobtracker.entity.JobApplication;
import com.pranamya.jobtracker.repository.JobApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplicationService {

    private final JobApplicationRepository repository;

    public JobApplicationService(JobApplicationRepository repository) {
        this.repository = repository;
    }

    public JobApplication create(JobApplication application) {
        return repository.save(application);
    }

    public List<JobApplication> getAll() {
        return repository.findAll();
    }

    public JobApplication updateStatus(Long id,
                                       ApplicationStatus status) {

        JobApplication application =
                repository.findById(id)
                        .orElseThrow(() ->
                                new RuntimeException("Application not found"));

        application.setStatus(status);

        return repository.save(application);
    }
}