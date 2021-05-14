package com.flyhub.ideams.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyhub.ideams.models.Idea;

@Repository
public interface IdeaRepository extends JpaRepository<Idea, String> {

}
