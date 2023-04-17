package com.eatta.currencyexchange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class currency {
	
	@GetMapping
	String getCurrency()
	{
		return "currency";
	}

}
