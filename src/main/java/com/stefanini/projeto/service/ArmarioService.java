package com.stefanini.projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stefanini.projeto.exception.TreinaException;
import com.stefanini.projeto.model.Armario;
import com.stefanini.projeto.repository.ArmarioRepository;

@Service
public class ArmarioService {

	@Autowired
	private ArmarioRepository repository;
	
	public List<Armario> findAll() throws TreinaException {
		return (List<Armario>) repository.findAll();
	}

}