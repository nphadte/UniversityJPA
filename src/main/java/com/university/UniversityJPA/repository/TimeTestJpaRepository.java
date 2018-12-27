package com.university.UniversityJPA.repository;

import com.university.UniversityJPA.model.TimeTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeTestJpaRepository extends JpaRepository<TimeTest, Long> {


}
