package com.lutfudolay.controller;

import java.util.List;

import com.lutfudolay.dto.DtoEmployee;

public interface IEmployeeController {

	public List<DtoEmployee> findAllEmployees();
}
