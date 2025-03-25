package com.lutfudolay.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lutfudolay.controller.IAddressController;
import com.lutfudolay.dto.DtoAddress;
import com.lutfudolay.services.IAddressService;

@RestController
@RequestMapping("rest/api/address")
public class AddressControllerImpl implements IAddressController {
	@Autowired
	private IAddressService addressService;

	@GetMapping(path = "list/{id}")
	@Override
	public DtoAddress findAddressById(@PathVariable(name="id") Long id) {
		
		return addressService.findAddressById(id);
	}

}
