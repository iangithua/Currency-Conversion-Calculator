package com.eatta.currencyexchange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CurrencyController {
	
	@GetMapping("/")
	String getCurrency(Model model)
	{
		return "currency";
	}
	
	@GetMapping("/compare")
	String getComparison(Model model)
	{
		return "compare";
	}
	
	@GetMapping("/convert")
	String getConvertion(Model model)
	{
		return "convert";
	}

}
