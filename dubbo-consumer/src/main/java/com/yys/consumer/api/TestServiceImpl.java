package com.yys.consumer.api;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.yys.common.interfaces.TestService;

@Service
@Component
public class TestServiceImpl implements TestService{

	@Override
	public String getStr(String arg0) throws Exception {
		return "CHANGZHOU" + arg0;
	}

}
