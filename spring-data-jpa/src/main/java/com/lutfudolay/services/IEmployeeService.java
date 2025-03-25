package com.lutfudolay.services;

import java.util.List;

import com.lutfudolay.dto.DtoEmployee;

public interface IEmployeeService {

	
	public List<DtoEmployee> findAllEmployees();
}
