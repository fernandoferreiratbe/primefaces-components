package io.github.fernandoferreira.evaluation.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.github.fernandoferreira.evaluation.model.Student;

@Named
@RequestScoped
public class StudentBean {

	private List<Student> students;
	
	public List<Student> getStudents() {
		return this.students;
	}
	
	public void createStudents() {
		this.students = new ArrayList<Student>();
		this.students.add(new Student(1L, "John Walker", "5th Avenue"));
		this.students.add(new Student(2L, "Marilyn Monroe", "Kenedy Street"));
		this.students.add(new Student(3L, "Martin Luther King", "501 Auburn Ave NE"));
		this.students.add(new Student(4L, "Malcolm X", "102 W 116th"));
	}

}
