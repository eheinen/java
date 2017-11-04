package com.richard.estudos.anotherproject.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.richard.estudos.anotherproject.controller.requests.UserRequest;

@RestController
@RequestMapping(value="/users")
public class UsersController {

	@RequestMapping(method=RequestMethod.GET, value="/")
	public ResponseEntity<String> list() {
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/")
	public ResponseEntity<String> create(@RequestBody UserRequest request) {
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
