package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Company;
import com.nt.model.Customer;

@RestController
public class CustomOperationController {
	
	@GetMapping("/report")
	public ResponseEntity<Customer> showdata(){
		//hardcoding for creeating object+
		Customer cust=new Customer(101,"raja", 566.8f,new String[]{"blue","red"},
				                                 List.of("10th","10+2"),
				                                 Set.of(627623,768689),
				                                 Map.of("adhaar",8763485,"pancard",687903),
				                                 new Company("HCL","london","software",5000));
	           			                                 
		HttpStatus status=HttpStatus.OK;
		return new ResponseEntity<Customer>(cust,status);
	}

}
