package com.student.demo.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.demo.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
