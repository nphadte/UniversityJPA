package com.university.UniversityJPA.repository;

import com.university.UniversityJPA.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee, Long> {
}

