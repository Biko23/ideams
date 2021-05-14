package com.flyhub.ideams.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyhub.ideams.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
