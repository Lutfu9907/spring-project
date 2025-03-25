package com.lutfudolay.services;

import com.lutfudolay.dto.DtoCustomer;

public interface ICustomerService{
	
	public DtoCustomer findCustomerById(Long id);

}
