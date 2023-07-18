package com.razakspringboot.learnjpaandhibernate.course.springdatajpa;

import com.razakspringboot.learnjpaandhibernate.course.Course;
import com.razakspringboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CourseSpringDataJpaCommandRunner implements CommandLineRunner
{
    @Autowired
    private CourseSpringDataJpa repository;

    @Override
    public void run(String... args) throws Exception
    {
        String author = "in28minutes";
        repository.save(new Course(1, "Learn JS", author));
        repository.save(new Course(2, "Learn RazzyTech Skills", author));
        repository.save(new Course(3, "Learn AWS Full Stack", author));
        repository.save(new Course(4, "Learn Cloud Computing", author));
        repository.save(new Course(5, "Learn Java", author));

        repository.deleteById(1l);
        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));
        System.out.println(repository.findAll());

        System.out.println(repository.findByAuthor(""));



    }
}
