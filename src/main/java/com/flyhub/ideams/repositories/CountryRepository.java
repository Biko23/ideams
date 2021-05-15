package com.flyhub.ideams.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyhub.ideams.models.Country;


@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
