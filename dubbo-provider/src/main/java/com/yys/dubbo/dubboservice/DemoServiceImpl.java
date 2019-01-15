package com.yys.dubbo.dubboservice;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.yys.common.interfaces.DemoService;

@Service
@Component
public class DemoServiceImpl implements DemoService{

	@Override
	public String getPhoneNo() throws Exception {
		return "18676719098";
	}

}
