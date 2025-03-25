package com.lutfudolay.services;

import java.util.List;

import com.lutfudolay.dto.DtoStudent;
import com.lutfudolay.dto.DtoStudentIU;

public interface IStudentService {

	public DtoStudent saveStudent(DtoStudentIU student);

	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
}
