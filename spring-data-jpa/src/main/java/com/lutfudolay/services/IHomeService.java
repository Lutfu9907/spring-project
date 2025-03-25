package com.lutfudolay.services;

import com.lutfudolay.dto.DtoHome;

public interface IHomeService {

	public DtoHome findHomeById(Long id);
}
