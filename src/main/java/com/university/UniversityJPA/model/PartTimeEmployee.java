package com.university.UniversityJPA.model;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class PartTimeEmployee extends Employee {

    private BigDecimal hourlywage;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(BigDecimal hourlywage) {
        this.hourlywage = hourlywage;
    }
}
