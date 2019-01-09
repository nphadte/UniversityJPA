package com.university.UniversityJPA.model;

import javax.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private Long id;

    private String description;

    private String rating;

    @ManyToOne
    private Course course;

    public Review() {
    }

    public Review(String description, String rating) {
        this.description = description;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return String.format("Review[%s %s]", rating, description);
    }
}

