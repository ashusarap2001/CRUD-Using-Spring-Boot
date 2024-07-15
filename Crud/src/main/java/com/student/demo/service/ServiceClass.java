package com.student.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.entity.Student;
import com.student.demo.reposistory.StudentRepo;
@Service
public class ServiceClass implements ServiceInterface {
@Autowired
private StudentRepo sr;
	@Override
	public Student saveStduent(Student student) {
		// TODO Auto-generated method stub
		return sr.save(student);
	}

	@Override
	public List<Student> getAllStduent() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return sr.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return sr.save(student);
	}

	@Override
	public void deleteByid(Integer id) {
		sr.deleteById(id);
		
	}

	
}
