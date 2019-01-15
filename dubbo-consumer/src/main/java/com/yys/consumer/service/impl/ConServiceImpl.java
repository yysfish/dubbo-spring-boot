package com.yys.consumer.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yys.common.interfaces.DemoService;
import com.yys.consumer.service.ConService;

@Service
public class ConServiceImpl implements ConService{

	@Reference(check=false)
	DemoService demoService;

	@Override
	public String getFromProvider() throws Exception {
		return demoService.getPhoneNo();
	}
	
	
}
