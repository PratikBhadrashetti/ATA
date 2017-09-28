package com.ata.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ata.bean.ProfileBean;
import com.ata.service.Administrator;
import com.ata.service.Customer;

@Controller
@RequestMapping(value = "ATA")
public class ATA {

	@Autowired
	Administrator admin ;
	
	@Autowired
	Customer customer ;
	
	@RequestMapping(value = "getLogin")
	public String login(Model model)
	{
		model.addAttribute("user", new ProfileBean());
		return "loginPage";
	}
	
	@RequestMapping(name = "postLogin" , method = RequestMethod.POST)
	public String login(@Valid @ModelAttribute ProfileBean bean , BindingResult br , Model model)
	{
		if(br.hasErrors())
		{
			return "loginPage";
		}
		else
		{
			
		  return "reservationPage";
		}
	}
	
	@RequestMapping(value = "getRegister")
	public String registeration(Model model)
	{
		model.addAttribute("user", new ProfileBean());
		return "registerationPage";
	}
	
	@RequestMapping(name = "postRegister" , method = RequestMethod.POST)
	public String registeration(@Valid @ModelAttribute ProfileBean bean , BindingResult br , Model model)
	{
		if(br.hasErrors())
		{
			return "loginPage";
		}
		else
		{
			
		  return "reservationPage";
		}
	}
	
}
