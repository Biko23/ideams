package com.flyhub.ideams.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyhub.ideams.models.Country;
import com.flyhub.ideams.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	public List<Country> getCountries(){
		
		return countryRepository.findAll();
	}

}
