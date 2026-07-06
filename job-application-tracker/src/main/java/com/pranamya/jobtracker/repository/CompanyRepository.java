package com.pranamya.jobtracker.repository;

import com.pranamya.jobtracker.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}