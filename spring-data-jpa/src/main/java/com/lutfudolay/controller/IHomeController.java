package com.lutfudolay.controller;

import com.lutfudolay.dto.DtoHome;

public interface IHomeController {

	public DtoHome findHomeById(Long id);
}