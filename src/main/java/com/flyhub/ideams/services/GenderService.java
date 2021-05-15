package com.flyhub.ideams.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyhub.ideams.models.Gender;
import com.flyhub.ideams.repositories.GenderRepository;

@Service
public class GenderService {
	
	@Autowired
	private GenderRepository genderRepository;
	
	public List<Gender> getGenders(){
		return genderRepository.findAll();
	}

}
