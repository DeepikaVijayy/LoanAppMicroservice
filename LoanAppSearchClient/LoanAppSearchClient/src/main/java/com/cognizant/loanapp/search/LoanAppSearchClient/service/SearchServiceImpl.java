package com.cognizant.loanapp.search.LoanAppSearchClient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.loanapp.search.LoanAppSearchClient.entity.LoanInformation;
import com.cognizant.loanapp.search.LoanAppSearchClient.repository.SearchRepository;

@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	private SearchRepository searchrepository;
	
	/*
	 * public SearchServiceImpl(SearchRepository searchrepository) { super();
	 * this.searchrepository = searchrepository; }
	 */

	@Override
	public LoanInformation findById(int loanId) {
		return searchrepository.findById(loanId);
	}

	@Override
	public LoanInformation findByAmount(double amount) {
		return searchrepository.findByAmount(amount);
	}

	
	 @Override public LoanInformation findByBorrowerName(String borrowerName) {
	    return searchrepository.findByBorrowerName(borrowerName); 
	    }
	 

}
