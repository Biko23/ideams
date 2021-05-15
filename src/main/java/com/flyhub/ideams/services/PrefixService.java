package com.flyhub.ideams.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyhub.ideams.models.Prefix;
import com.flyhub.ideams.repositories.PrefixRepository;

@Service
public class PrefixService {
	
	@Autowired
	private PrefixRepository prefixRepository;
	
	public List<Prefix> getPrefixes(){
		return prefixRepository.findAll();
	}

}
