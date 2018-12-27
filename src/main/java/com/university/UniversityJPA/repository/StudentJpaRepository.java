package com.university.UniversityJPA.repository;

import com.university.UniversityJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface StudentJpaRepository extends JpaRepository<Student, Long> {

    /*public void saveStudentWithPassport();*/

    /*{
        Passport p = new Passport("EL2789076");
        Student s1 = new Student();
        s1.setName("John Young");
        Address a = new Address("4025 Matheson Road"," near Timmys" ,"Toronto");
        s1.setAddress(a);

        s1.setPassport(p);
        this.saveAndFlush(s1);
    }
*/
}
