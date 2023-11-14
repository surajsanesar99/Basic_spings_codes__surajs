package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/student")
	public Student getStudent() {
		Student stu = new Student("Er", "Suraj Sanesar");

		return stu;
		// return new Student("suraj","sanesar");
	}

	@GetMapping("/students")
	public List<Student> getStudents() {

		List<Student> students = new ArrayList<>();
		students.add(new Student("harsha", "khadse"));
		students.add(new Student("gabbar", "khadse"));
		students.add(new Student("adhira", "khadse"));
		students.add(new Student("k", "k"));

		return students;

	}

	@GetMapping("student/info")
	public Student getDetails(@RequestParam(name = "f") String f, @RequestParam(name = "l") String l) {

		return new Student(f, l);
	}

	@GetMapping("/student/{fname}/{lname}/{age}")
	public Student stuPathVariable(@PathVariable("fname") String fname, @PathVariable("lname") String lname) {

		return new Student(fname, lname);
	}

}
