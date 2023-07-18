package com.razakspringboot.learnjpaandhibernate.course.springdatajpa;

import com.razakspringboot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpa extends JpaRepository<Course, Long> {
}
