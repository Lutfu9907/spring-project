package com.lutfudolay.services;

import com.lutfudolay.dto.DtoAddress;

public interface IAddressService {

	public DtoAddress findAddressById(Long id);
}
