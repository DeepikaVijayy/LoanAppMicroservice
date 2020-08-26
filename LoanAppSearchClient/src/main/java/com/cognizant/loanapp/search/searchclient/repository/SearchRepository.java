package com.cognizant.loanapp.search.searchclient.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.loanapp.search.searchclient.entity.LoanInformation;

@Repository
public interface SearchRepository extends CrudRepository<LoanInformation, Integer> {

	public Optional<LoanInformation> findById(int id);
	
	@Query("select L from LoanInformation L where L.loanAmount = :amount")
	public Optional<List<LoanInformation>> findByAmount(double amount);
	
	@Query("select count(L) from LoanInformation L where L.loanAmount = :amount")
	public Long countByAmount(double amount);
	
	@Query("select L from LoanInformation L inner join BorrowerInformation B "
			+ " on L.borrower = B.id where B.borrowerName = :borrowerName")
	public Optional<List<LoanInformation>> findByBorrowerName(String borrowerName); 
	
	
	/* public LoanInformation save(LoanInformation loanInfo); */
}
