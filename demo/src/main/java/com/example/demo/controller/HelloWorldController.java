package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(value="/hello",method=RequestMethod.POST)
	public String index() {
		
		return "HelloWorldMyFirstSpringBoot";
	}
	
	@GetMapping(value="add",consumes="application/json")
	public String add() {
		String name="jeckey";
		int thisyearage=22;
		int lastyearage=21;
		return "";
	}
	/**
	 * 修改，更新；更新对象属性（为部分更新）
	 * @return
	 */
	@PatchMapping(value="update/{ming}")
	public Map<String, Object> update(@PathVariable String ming){
		Map<String,Object> modelAndView=new HashMap<String,Object>();
		modelAndView.put("xiaoming",ming );
		return modelAndView;
	}
	
	
}
