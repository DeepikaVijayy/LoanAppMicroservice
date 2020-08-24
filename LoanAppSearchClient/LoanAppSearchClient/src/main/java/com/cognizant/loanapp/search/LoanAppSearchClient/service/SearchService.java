package com.cognizant.loanapp.search.LoanAppSearchClient.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cognizant.loanapp.search.LoanAppSearchClient.entity.LoanInformation;

public interface SearchService {
	
	// Search by Loan number
	public LoanInformation findById(int loanId);
	
	// Search by Loan Amount
	public LoanInformation findByAmount(double amount);
	
	// Search by Borrower name
	public LoanInformation findByBorrowerName(String borrowerName);

}
