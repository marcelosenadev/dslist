package com.sena.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.dslist.dto.GameMinDTO;
import com.sena.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	public List<GameMinDTO> findAll(){
		
		return repository.findAll().stream().map(GameMinDTO::new).toList();
	}

}
