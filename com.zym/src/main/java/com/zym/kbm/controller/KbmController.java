package com.zym.kbm.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zym.kbm.dto.Labean;
import com.zym.kbm.service.interfaces.LuceneService;

@Component
@RequestMapping("/")
public class KbmController {
		
	@Autowired
	LuceneService luceneService;
	
	@RequestMapping(value="/mvc{param}",method=RequestMethod.GET)
	public String first(Model model,@PathVariable(value="param")String param) throws ParseException{
		
		System.err.println("/MVC/MVC2");
		model.addAttribute("Labeans",luceneService.getDataByParam(param));
		return "index";
	}
	
	@RequestMapping(value="/sear/{param}",method=RequestMethod.GET)
	@ResponseBody
	public List<Labean> getDataByParam(Model model,@PathVariable(value="param")String param) throws ParseException{
		
		System.err.println("/MVCsear");
		//model.addAttribute("Labeans",luceneService.getDataByParam(param));
		return luceneService.getDataByParam(param);
	}
		
	@RequestMapping(value="/logIn",method=RequestMethod.GET)
	public String adminIn() {
		
		return "redirect:/static/index.html";
	}
	
	@RequestMapping(value="/portal/console",method=RequestMethod.GET)
	public String adminPortal() {
		
		return "redirect:/static/login.html";
	}
}
