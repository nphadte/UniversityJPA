package com.university.UniversityJPA.repository;

import com.university.UniversityJPA.model.Employee;
import com.university.UniversityJPA.model.FullTimeEmployee;
import com.university.UniversityJPA.model.PartTimeEmployee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Transactional
public class EmployeePersistenceRepository {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EntityManager em;

    public void insert(Employee employee) {
        em.persist(employee);
    }

    public List<PartTimeEmployee> retrieveAllPartTimeEmployees() {
        return em.createQuery("select e from PartTimeEmployee e", PartTimeEmployee.class).getResultList();
    }

    public List<FullTimeEmployee> retrieveAllFullTimeEmployees() {
        return em.createQuery("select e from FullTimeEmployee e", FullTimeEmployee.class).getResultList();
    }
}
