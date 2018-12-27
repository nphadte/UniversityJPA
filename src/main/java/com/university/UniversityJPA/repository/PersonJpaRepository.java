package com.university.UniversityJPA.repository;

import com.university.UniversityJPA.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonJpaRepository extends JpaRepository<Person, Long> {

}
