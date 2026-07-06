package com.pranamya.jobtracker.repository;

import com.pranamya.jobtracker.entity.ApplicationStatus;
import com.pranamya.jobtracker.entity.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobApplicationRepository
        extends JpaRepository<JobApplication, Long> {

    long countByStatus(ApplicationStatus status);
}