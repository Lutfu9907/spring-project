package com.lutfudolay.controller;

import com.lutfudolay.dto.DtoAddress;

public interface IAddressController {

	public DtoAddress findAddressById(Long id);
}
