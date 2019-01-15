package com.yys.dubbo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yys.common.interfaces.TestService;

@RestController
@RequestMapping("/test")
public class TestController {

	@Reference(check=false)
	TestService testService;
	
	@RequestMapping("/get")
	public String getCityName() throws Exception {
		return testService.getStr("1");
	}
	
}
