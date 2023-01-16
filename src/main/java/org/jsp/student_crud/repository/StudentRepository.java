package org.jsp.student_crud.repository;

import java.util.List;

import org.jsp.student_crud.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>
{

	List<Student> findByName(String name);

	List<Student> findByMobile(long mobile);

	List<Student> findByStandard(String std);

	@Query("select x from Student x where percentage=(select max(percentage) from Student)")
	List<Student> fetchMaxPercentage();

	@Query("select x from Student x where percentage>=85")
	List<Student> distinction();
	
	@Query("select x from Student x where percentage>=60 and percentage<85")
	List<Student> firstClass();
	
	@Query("select x from Student x where percentage<35")
	List<Student> fail();
	
	
	
	
	
	

}
