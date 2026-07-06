package com.pranamya.jobtracker.controller;

import com.pranamya.jobtracker.entity.ApplicationStatus;
import com.pranamya.jobtracker.entity.JobApplication;
import com.pranamya.jobtracker.service.JobApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications")
public class JobApplicationController {

    private final JobApplicationService service;

    public JobApplicationController(JobApplicationService service) {
        this.service = service;
    }

    @PostMapping
    public JobApplication create(
            @RequestBody JobApplication application) {

        return service.create(application);
    }

    @GetMapping
    public List<JobApplication> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}/status")
    public JobApplication updateStatus(
            @PathVariable Long id,
            @RequestParam ApplicationStatus status) {

        return service.updateStatus(id, status);
    }
}