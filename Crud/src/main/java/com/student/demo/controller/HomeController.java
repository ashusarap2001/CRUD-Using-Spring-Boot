package com.student.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.demo.entity.Student;
import com.student.demo.service.ServiceClass;

import jakarta.websocket.server.PathParam;


@Controller
public class HomeController {
	@Autowired
	private ServiceClass sc;
	
	@GetMapping("/")
	public String index(@ModelAttribute Student student, Model model) {
		List<Student> lst=sc.getAllStduent();
		model.addAttribute("stdData", lst);
		
		return "index.html";
	}
	@GetMapping("/addStudent.html")
	public String getMethodName() {
		return "addStudent.html";
	}

	
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute Student student) {
		sc.saveStduent(student);
		return "redirect:/";
	}
	
	@GetMapping("/student/edit/{id}")
	public String getStudentById(@PathVariable Integer id,Model model) {
		model.addAttribute("getData",sc.getStudentById(id));
		
		
		return "editStudent.html";
	}
	@PostMapping("/updateStudent")
	public String updateStudent(@ModelAttribute Student student) {
		sc.updateStudent(student);
		return "redirect:/";
	}
	
@GetMapping("/delete/student{id}")
public String deleteStduent(@PathVariable Integer id) {
	sc.deleteByid(id);
	return "redirect:/";
}

	
}
