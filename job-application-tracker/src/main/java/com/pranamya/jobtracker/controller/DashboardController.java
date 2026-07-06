package com.pranamya.jobtracker.controller;

import com.pranamya.jobtracker.dto.DashboardResponse;
import com.pranamya.jobtracker.entity.ApplicationStatus;
import com.pranamya.jobtracker.repository.JobApplicationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {

    private final JobApplicationRepository repository;

    public DashboardController(JobApplicationRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/dashboard")
    public DashboardResponse getDashboard() {

        DashboardResponse response =
                new DashboardResponse();

        response.setTotalApplications(
                repository.count());

        response.setApplied(
                repository.countByStatus(
                        ApplicationStatus.APPLIED));

        response.setInterview(
                repository.countByStatus(
                        ApplicationStatus.INTERVIEW));

        response.setSelected(
                repository.countByStatus(
                        ApplicationStatus.SELECTED));

        response.setRejected(
                repository.countByStatus(
                        ApplicationStatus.REJECTED));

        return response;
    }
}