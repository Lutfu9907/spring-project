package com.lutfudolay.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lutfudolay.configuration.DataSource;
import com.lutfudolay.configuration.GlobalProperties;
import com.lutfudolay.configuration.Server;

@RestController
@RequestMapping("rest/api/property")
public class PropertySourceController {

	@Autowired
	public GlobalProperties globalProperties;
	
	@GetMapping("/dataSource")
	public DataSource getDataSource() {
		
		return null;
	}
	
	@GetMapping(value = "/getServers")
	public List<Server> getServers(){
		return globalProperties.getServers();
	}
}