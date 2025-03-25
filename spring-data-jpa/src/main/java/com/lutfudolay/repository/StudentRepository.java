package com.lutfudolay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lutfudolay.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	@Query(value="select * from student.student", nativeQuery = true)
	List<Student> findAllStudents();
}
