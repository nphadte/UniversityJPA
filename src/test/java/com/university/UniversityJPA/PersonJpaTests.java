package com.university.UniversityJPA;

import com.university.UniversityJPA.model.Person;
import com.university.UniversityJPA.repository.PersonJpaRepository;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonJpaTests {
    @Autowired
    private PersonJpaRepository personJpaRepository;

    @Before
    public void before(){
        System.out.println("This will run before every tests:");
    }

    @Test
    @DirtiesContext
    public void  getPersons(){
        // Absence of failure is success
        List<Person> persons =  personJpaRepository.findAll();

        for ( Person p : persons ){
            System.out.println(p.getId()+ ":" + p.getName());
        }
        assert (persons.size() >= 0 );
        //fail(persons.size()!>= 0 );
        //assertEquals(expected, actual);
        //assertTrue(condition); // if the condition evaluates to true
        //assertFalse(condition);
        //assertNull;
        //assertNotNull;
        //assertArrayEquals(expecteds , actuals );
    }

    public void insertAndDeletePerson(){

        Person p = new Person(1500L, "Ishan", "Toronto", new java.util.Date());
        p = personJpaRepository.save(p);
        assertEquals(1500L, p.getId().longValue());

        personJpaRepository.deleteById(1500L);
        assertNull(personJpaRepository.findById(1500L));

    }

    @BeforeClass
    public static  void beforeClass(){
        System.out.println("This is a static method at the class level");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("This is a static method at the class level");
    }

    @After
    public  void after(){
        System.out.println("After ");
    }
}

