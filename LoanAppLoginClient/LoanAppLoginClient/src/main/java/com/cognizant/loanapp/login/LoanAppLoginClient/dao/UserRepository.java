package com.cognizant.loanapp.login.LoanAppLoginClient.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.loanapp.login.LoanAppLoginClient.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

	Optional<Users> findByUserName(String userName);
}
