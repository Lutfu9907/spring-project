package com.lutfudolay.controller;

import com.lutfudolay.dto.DtoCustomer;

public interface ICustomerController {

	public DtoCustomer findCustomerById(Long id);
}
