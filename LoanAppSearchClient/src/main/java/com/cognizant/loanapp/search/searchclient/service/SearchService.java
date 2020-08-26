package com.cognizant.loanapp.search.searchclient.service;

import java.util.List;
import java.util.Optional;

import com.cognizant.loanapp.search.searchclient.entity.LoanInformation;

public interface SearchService {
	// get all the loans
	public Iterable<LoanInformation> findAll();
	
	// Search by Loan number
	public Optional<LoanInformation> findById(int loanId);
	
	// Search by Loan Amount
	public Optional<List<LoanInformation>> findByAmount(double amount);
	
	// Search by Borrower name
	public Optional<List<LoanInformation>> findByBorrowerName(String borrowerName);
	
	// Search by Borrower name
	public LoanInformation save(LoanInformation loanInfo);


}
