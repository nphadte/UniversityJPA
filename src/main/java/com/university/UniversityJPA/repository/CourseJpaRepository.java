package com.university.UniversityJPA.repository;

import com.university.UniversityJPA.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseJpaRepository extends JpaRepository<Course,Long> {

 /*   //private Logger logger = LoggerFactory.getLogger(this.getClass());
    public void addHardcodedReviewsForCourse();
    public void addReviewsForCourse(Long courseId, List<Review> reviews);*/

    List<Course> findByNameAndId(String name, Long id);

    List<Course> findByName(String name);

    List<Course> countByName(String name);

    List<Course> findByNameOrderByIdDesc(String name);

    List<Course> deleteByName(String name);

    /*@Query("Select  c  From Course c where name like '%100 Steps'")
    List<Course> courseWith100StepsInName();

    @Query(value = "Select  *  From Course c where name like '%100 Steps'", nativeQuery = true)
    List<Course> courseWith100StepsInNameUsingNativeQuery();

    @Query(name = "query_get_100_Step_courses")
    List<Course> courseWith100StepsInNameUsingNamedQuery();*/
}
