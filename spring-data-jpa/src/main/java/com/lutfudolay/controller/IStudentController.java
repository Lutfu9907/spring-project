package com.lutfudolay.controller;

import java.util.List;

import com.lutfudolay.dto.DtoStudent;
import com.lutfudolay.dto.DtoStudentIU;

public interface IStudentController {


	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) ;
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);

	public void deleteStudent(Integer id);
	
}