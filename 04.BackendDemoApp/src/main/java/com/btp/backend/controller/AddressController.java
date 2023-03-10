package com.btp.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.btp.backend.services.*;
import com.btp.backend.entities.Address;

@RestController
public class AddressController {
	
	@Autowired
	AddressService addSrv;
	
	@RequestMapping("/address")
	public List<Address> readAddresses(){
		return addSrv.getAddresses();
	}
	
	@PostMapping("/address")
	public Address createAddress(@RequestBody Address postBody) {
		return addSrv.createAddress(postBody);
	}
}
