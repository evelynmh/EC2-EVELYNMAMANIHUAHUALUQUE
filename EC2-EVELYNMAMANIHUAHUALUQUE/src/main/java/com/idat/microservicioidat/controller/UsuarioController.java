package com.idat.microservicioidat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.idat.microservicioidat.security.UserDetailService;

@RestController
public class UsuarioController {

	@Autowired
	private UserDetailsService service;
}
