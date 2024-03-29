package com.stefanini.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stefanini.projeto.exception.TreinaException;
import com.stefanini.projeto.model.Armario;
import com.stefanini.projeto.service.ArmarioService;

@CrossOrigin
@Controller
@RequestMapping(value = "/armarios")
public class ArmarioController {

	@Autowired
	private ArmarioService service;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Armario> findAll() throws TreinaException {
		return service.findAll();
	}

}