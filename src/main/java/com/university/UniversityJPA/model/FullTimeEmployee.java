package com.university.UniversityJPA.model;

import javax.persistence.Entity;
import java.math.BigDecimal;

public class FullTimeEmployee extends Employee {

    private BigDecimal salary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(Long id, String name, BigDecimal salary) {
        super(id, name);
        this.salary = salary;
    }
}
