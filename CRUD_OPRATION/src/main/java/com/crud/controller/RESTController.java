package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.service.RegService;


@RestController
public class RESTController {
	
	@Autowired
	private RegService regService;
	
	@GetMapping("/user")
	public ResponseEntity<?> getUser(){
		
		List ls = this.regService.search();
		return ResponseEntity.ok(ls);
		
	}

}
