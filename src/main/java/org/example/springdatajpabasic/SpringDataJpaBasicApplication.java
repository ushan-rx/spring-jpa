package org.example.springdatajpabasic;

import org.example.springdatajpabasic.model.Student;
import org.example.springdatajpabasic.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaBasicApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringDataJpaBasicApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);

//        Student s1 = context.getBean(Student.class);
//        Student s2 = context.getBean(Student.class);
//        Student s3 = context.getBean(Student.class);
//
//        s1.setRollNo(1);
//        s1.setName("ushan");
//        s1.setMarks(33);
//
//        s2.setRollNo(2);
//        s2.setName("kushan");
//        s2.setMarks(83);
//
//        s3.setRollNo(3);
//        s3.setName("thushan");
//        s3.setMarks(53);
//
//        repo.save(s1);
//        repo.save(s2);
//        repo.save(s3);

//        System.out.println(repo.findAll());

        Optional<Student> s = repo.findById(1);

        System.out.println(s.orElse(new Student()));

    }


}
