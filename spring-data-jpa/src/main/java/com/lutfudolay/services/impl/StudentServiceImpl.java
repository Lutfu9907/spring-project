package com.lutfudolay.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lutfudolay.dto.DtoCourse;
import com.lutfudolay.dto.DtoStudent;
import com.lutfudolay.dto.DtoStudentIU;
import com.lutfudolay.entities.Course;
import com.lutfudolay.entities.Student;
import com.lutfudolay.repository.StudentRepository;
import com.lutfudolay.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	public StudentRepository studentRepository;

	@Override
	public DtoStudent saveStudent(DtoStudentIU dtoStudent) {
		DtoStudent response = new DtoStudent();
		Student student = new Student();
		BeanUtils.copyProperties(dtoStudent, student);

		Student dbStudent = studentRepository.save(student);
		BeanUtils.copyProperties(dbStudent, response);
		return response;

	}

	@Override
	public List<DtoStudent> getAllStudents() {
		List<DtoStudent> dtoList = new ArrayList<>();

		List<Student> studentList = studentRepository.findAllStudents();
		for (Student student : studentList) {
			DtoStudent dto = new DtoStudent();
			BeanUtils.copyProperties(student, dto);
			dtoList.add(dto);
		}
		return dtoList;
	}

	@Override
	public DtoStudent getStudentById(Integer id) {
		
		DtoStudent dtoStudent = new DtoStudent();
		Optional<Student> optional=studentRepository.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		
		Student dbStudent = optional.get();
		BeanUtils.copyProperties(dbStudent, dtoStudent);
		
		if(dbStudent.getCourses()!=null && !dbStudent.getCourses().isEmpty()) {
			for (Course course: dbStudent.getCourses()) {
				DtoCourse dtoCourse = new DtoCourse();
				BeanUtils.copyProperties(course, dtoCourse);
				
				dtoStudent.getCourses().add(dtoCourse);
			}
		}
		
		return null;
	}

	@Override
	public void deleteStudent(Integer id) {
		Optional<Student> optional=studentRepository.findById(id);
		if (optional.isPresent()) {
			studentRepository.delete(optional.get());
		}
	}
}
