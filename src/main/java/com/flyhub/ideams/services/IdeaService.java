package com.flyhub.ideams.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyhub.ideams.models.Idea;
import com.flyhub.ideams.repositories.IdeaRepository;

@Service
public class IdeaService {
	
	@Autowired
	private IdeaRepository ideaRepository;
	
	public List<Idea> getIdeas(){
		return ideaRepository.findAll();
	}

}
