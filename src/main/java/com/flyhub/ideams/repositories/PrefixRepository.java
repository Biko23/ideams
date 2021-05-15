package com.flyhub.ideams.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyhub.ideams.models.Prefix;


@Repository
public interface PrefixRepository extends JpaRepository<Prefix, Integer> {

}
