package org.jsp.student_crud.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.student_crud.dto.Student;
import org.jsp.student_crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDao 
{

	@Autowired
	StudentRepository repository;
	
	public Student saveone(Student student) {
		return repository.save(student);
	}

	public List<Student> savemany(List<Student> students) {
		return repository.saveAll(students);
	}

	public Optional<Student> fetchById(int id) {
		return repository.findById(id);
	}

	public List<Student> fetchByName(String name) {
		return repository.findByName(name);
	}

	public List<Student> fetchAll() {
		return repository.findAll();
	}

	public List<Student> fetchByMobile(long mobile) {
		return repository.findByMobile(mobile);
	}

	public List<Student> fetchByStandard(String std) {
		return repository.findByStandard(std);
	}

	public List<Student> fetchMaxPercentage() {
		return repository.fetchMaxPercentage();
	}

	public List<Student> distinction() {
		return repository.distinction();
	}

	public List<Student> firstClass() {
		return repository.firstClass();
	}
	
	public List<Student> fail() {
		return repository.fail();
	}
	
	public Student update(Student student) {
		return repository.save(student);
	}
	
	public void delete(int id)
	{
		repository.deleteById(id);
	}

}
