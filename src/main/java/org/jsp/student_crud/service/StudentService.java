package org.jsp.student_crud.service;

import java.util.List;
import java.util.Optional;

import org.jsp.student_crud.dao.StudentDao;
import org.jsp.student_crud.dto.Student;
import org.jsp.student_crud.helper.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	StudentDao dao;

	public ResponseStructure<Student> saveone(Student student) {
		student.setTotalmarks(student.getEnglish()+student.getKannada()+student.getMathematics());
		student.setPercentage(student.getTotalmarks()/3);
		
		ResponseStructure<Student> structure=new ResponseStructure<>();
		structure.setMessage("Data Inserted Successfully");
		structure.setData(dao.saveone(student));
		structure.setStatus(HttpStatus.CREATED.value());
		return structure;
	}

	public ResponseStructure<List<Student>> savemany(List<Student> students) {
		for(Student student:students)
		{
			student.setTotalmarks(student.getEnglish()+student.getKannada()+student.getMathematics());
			student.setPercentage(student.getTotalmarks()/3);
		}
		
		ResponseStructure<List<Student>> structure=new ResponseStructure<>();
		structure.setMessage("Data Inserted Successfully");
		structure.setData(dao.savemany(students));
		structure.setStatus(HttpStatus.CREATED.value());
		return structure;
		
	}

	public ResponseStructure<Student> fetchById(int id) {
		Optional<Student> optional = dao.fetchById(id);
		
		ResponseStructure<Student> structure=new ResponseStructure<>();
		
		if(optional.isEmpty())
		{
			structure.setMessage("Data Not Found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
		}
		else {
			structure.setMessage("Data Found");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(optional.get());
		}
		
		return structure;
	}

	public ResponseStructure<List<Student>> fetchByName(String name) {
		List<Student> students = dao.fetchByName(name);
		
		ResponseStructure<List<Student>> structure=new ResponseStructure<>();
		
		if(students.isEmpty())
		{
			structure.setMessage("Data Not Found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
		}
		else {
			structure.setMessage("Data Found");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(students);
		}
		
		return structure;
	}

	public ResponseStructure<List<Student>> fetchAll() {
		List<Student> students = dao.fetchAll();
		
		ResponseStructure<List<Student>> structure=new ResponseStructure<>();
		
		if(students.isEmpty())
		{
			structure.setMessage("Data Not Found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
		}
		else {
			structure.setMessage("Data Found");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(students);
		}
		
		return structure;
	}

	public ResponseStructure<List<Student>> fetchByMobile(long mobile) {
		List<Student> students = dao.fetchByMobile(mobile);
		
		ResponseStructure<List<Student>> structure=new ResponseStructure<>();
		
		if(students.isEmpty())
		{
			structure.setMessage("Data Not Found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
		}
		else {
			structure.setMessage("Data Found");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(students);
		}
		
		return structure;
	}

	public ResponseStructure<List<Student>> fetchByStandard(String std) {
List<Student> students = dao.fetchByStandard(std);
		
		ResponseStructure<List<Student>> structure=new ResponseStructure<>();
		
		if(students.isEmpty())
		{
			structure.setMessage("Data Not Found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
		}
		else {
			structure.setMessage("Data Found");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(students);
		}
		
		return structure;
	}

	public ResponseStructure<List<Student>> fetchMaxPercentage() {
		
		List<Student> student=dao.fetchMaxPercentage();
		ResponseStructure<List<Student>> structure=new ResponseStructure<>();
		
		if(student.isEmpty())
		{
			structure.setMessage("Data Not Found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
		}
		else {
			structure.setMessage("Data Found");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(student);
		}
		
		return structure;
	}

	public ResponseStructure<List<Student>> fetchDistinction() {
		List<Student> student=dao.distinction();
		ResponseStructure<List<Student>> structure=new ResponseStructure<>();
		
		if(student.isEmpty())
		{
			structure.setMessage("Data Not Found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
		}
		else {
			structure.setMessage("Data Found");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(student);
		}
		
		return structure;
	}

	public ResponseStructure<List<Student>> firstclass() {
		List<Student> student=dao.firstClass();
		ResponseStructure<List<Student>> structure=new ResponseStructure<>();
		
		if(student.isEmpty())
		{
			structure.setMessage("Data Not Found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
		}
		else {
			structure.setMessage("Data Found");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(student);
		}
		
		return structure;
	}

	public ResponseStructure<List<Student>> fail() {
		List<Student> student=dao.fail();
		ResponseStructure<List<Student>> structure=new ResponseStructure<>();
		
		if(student.isEmpty())
		{
			structure.setMessage("Data Not Found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
		}
		else {
			structure.setMessage("Data Found");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(student);
		}
		
		return structure;
	}

	public ResponseStructure<Student> update(Student student) {
		student.setTotalmarks(student.getEnglish()+student.getKannada()+student.getMathematics());
		student.setPercentage(student.getTotalmarks()/3);
		
		ResponseStructure<Student> structure=new ResponseStructure<>();
		structure.setMessage("Data Updated Successfully");
		structure.setData(dao.update(student));
		structure.setStatus(HttpStatus.ACCEPTED.value());
		return structure;
	}

	public ResponseStructure<Student> delete(int id) {
		Optional<Student> optional = dao.fetchById(id);
		
		ResponseStructure<Student> structure=new ResponseStructure<>();
		
		if(optional.isEmpty())
		{
			structure.setMessage("Data Not Found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
		}
		else {
			dao.delete(id);
			structure.setMessage("Data deleted Successfully");
			structure.setData(optional.get());
			structure.setStatus(HttpStatus.OK.value());
		}
		
		return structure;
	}

}
