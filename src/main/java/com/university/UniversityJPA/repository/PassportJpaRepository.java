package com.university.UniversityJPA.repository;

import com.university.UniversityJPA.model.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportJpaRepository extends JpaRepository<Passport, Long> {
}
