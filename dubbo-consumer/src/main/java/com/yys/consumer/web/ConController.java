package com.yys.consumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yys.consumer.service.ConService;

@RestController
@RequestMapping("/con")
public class ConController {

	@Autowired
	ConService conService;
	
	@RequestMapping("/get")
	public String get() throws Exception {
		return conService.getFromProvider();
	}
}
