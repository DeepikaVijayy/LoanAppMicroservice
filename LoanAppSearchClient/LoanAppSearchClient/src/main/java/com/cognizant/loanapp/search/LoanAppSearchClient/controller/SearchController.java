package com.cognizant.loanapp.search.LoanAppSearchClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loanapp.search.LoanAppSearchClient.entity.LoanInformation;
import com.cognizant.loanapp.search.LoanAppSearchClient.service.SearchService;
import com.cognizant.loanapp.search.LoanAppSearchClient.service.SearchServiceImpl;

@RestController
@RequestMapping("/search")
public class SearchController {
	
	// default constructor
	public SearchController() {
	}
	
	@Autowired
	private SearchServiceImpl searchService;

	/*
	 * public SearchController(SearchServiceImpl searchService) { super();
	 * this.searchService = searchService; }
	 */

	// Search Loan by loan number
	@GetMapping("/loan/{id}")
	public LoanInformation findById(@PathVariable("id") int loanId) {
		
		return searchService.findById(loanId);
		
	}
	
	// Search Loan by loan amount
	@GetMapping("/loanByAmount/{amount}")
	public LoanInformation findByAmount(@PathVariable("amount") double amount) {
		
		return searchService.findByAmount(amount);
		
	}
	
	// Search Loan by borrower name
	@GetMapping("/loanByBorrowerName/{borrowerName}")
	public LoanInformation findByBorrowerName(@PathVariable("borrowerName") String borrowerName) {
			
		return searchService.findByBorrowerName(borrowerName);
			
	}

}
