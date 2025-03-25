package com.lutfudolay.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lutfudolay.controller.ICustomerController;
import com.lutfudolay.controller.IHomeController;
import com.lutfudolay.dto.DtoCustomer;
import com.lutfudolay.dto.DtoHome;
import com.lutfudolay.services.ICustomerService;
import com.lutfudolay.services.IHomeService;

@RestController
@RequestMapping("rest/api/home")
public class HomeControllerImpl implements IHomeController {
	
	@Autowired
	private IHomeService homeService;

	@GetMapping(path = "/{id}")
	@Override
	public DtoHome findHomeById(@PathVariable(name ="id") Long id) {
		
		return homeService.findHomeById(id);
	}
}

