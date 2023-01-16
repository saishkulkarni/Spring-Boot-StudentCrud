package org.jsp.student_crud.controller;

import java.util.List;

import org.jsp.student_crud.dto.Student;
import org.jsp.student_crud.helper.ResponseStructure;
import org.jsp.student_crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("students")
public class StudentController 
{
	@Autowired
	StudentService service;
	

	@PostMapping("saveone")
	public ResponseStructure<Student> saveone(@RequestBody Student student)
	{
		return service.saveone(student);
	}
	
	@PostMapping("savemany")
	public ResponseStructure<List<Student>> savemany(@RequestBody List<Student> students)
	{
		return service.savemany(students);
	}
	
	@GetMapping("fetch")
	public ResponseStructure<Student> fetchById1(@RequestParam int id)
	{
		return service.fetchById(id);
	}
	
	@GetMapping("fetch/{id}")
	public ResponseStructure<Student> fetchById2(@PathVariable int id)
	{
		return service.fetchById(id);
	}
	
	@GetMapping("fetchbyname/{name}")
	public ResponseStructure<List<Student>> fetchByName(@PathVariable String name)
	{
		return service.fetchByName(name);
	}
	
	@GetMapping("fetchall")
	public ResponseStructure<List<Student>> fetchall()
	{
		return service.fetchAll();
	}
	
	@GetMapping("fetchbymobile/{mobile}")
	public ResponseStructure<List<Student>> fetchByMobile(@PathVariable long mobile)
	{
		return service.fetchByMobile(mobile);
	}
	
	@GetMapping("fetchbystd/{std}")
	public ResponseStructure<List<Student>> fetchByStandard(@PathVariable String std)
	{
		return service.fetchByStandard(std);
	}
	
	@GetMapping("fetchmaxpercentage")
	public ResponseStructure<List<Student>> fetchMaxPercentage()
	{
		return service.fetchMaxPercentage();
	}
	
	@GetMapping("distinction")
	public ResponseStructure<List<Student>> distinction()
	{
		return service.fetchDistinction();
	}
	
	@GetMapping("firstclass")
	public ResponseStructure<List<Student>> firstclass()
	{
		return service.firstclass();
	}
	
	@GetMapping("fail")
	public ResponseStructure<List<Student>> fail()
	{
		return service.fail();
	}
	
	@PutMapping("update")
	public ResponseStructure<Student> update(@RequestBody Student student)
	{
		return service.update(student);
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseStructure<Student> delete(@PathVariable int id)
	{
		return service.delete(id);
	}
}
