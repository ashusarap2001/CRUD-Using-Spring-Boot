package com.student.demo.service;

import java.util.List;

import com.student.demo.entity.Student;

public interface ServiceInterface {
	public Student saveStduent(Student student);

	List<Student> getAllStduent();
	public Student getStudentById(Integer id);
	public Student updateStudent(Student student);
	public void deleteByid(Integer id);
	
}
