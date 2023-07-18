package com.razakspringboot.learnjpaandhibernate.course.jdbc;

import com.razakspringboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception
    {
        String author = "in28minutes";
         repository.insert(new Course(1, "Learn AWS Now!", author));
         repository.insert(new Course(2, "Learn Azure", author));
         repository.insert(new Course(3, "Learn DevOps", author));
         repository.insert(new Course(4, "Learn AWS Full Stack", author));
         repository.insert(new Course(5, "Learn Cloud Computing", author));
         repository.insert(new Course(6, "Learn Java", author));

       repository.deleteById(1);
        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));


    }
}
