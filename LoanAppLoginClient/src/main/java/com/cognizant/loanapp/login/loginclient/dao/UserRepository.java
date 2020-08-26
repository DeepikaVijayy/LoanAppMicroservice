package com.cognizant.loanapp.login.loginclient.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.loanapp.login.loginclient.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

	Optional<Users> findByUserName(String userName);
}
