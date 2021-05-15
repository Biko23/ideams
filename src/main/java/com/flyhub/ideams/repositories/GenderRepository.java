package com.flyhub.ideams.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyhub.ideams.models.Gender;


@Repository
public interface GenderRepository extends JpaRepository<Gender, Integer> {

}
