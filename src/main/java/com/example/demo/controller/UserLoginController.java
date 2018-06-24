package com.example.demo.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.service.helloService;
import com.example.demo.dao.CustomerRepository;
import com.example.demo.model.MinTbCustomerJpa;

@Controller
@RequestMapping("/userLoginController")
public class UserLoginController {
	
	private static final Logger logger = LogManager.getLogger(UserLoginController.class);
	
	@Autowired
	helloService helloService1;
	
	@Autowired
	CustomerRepository CustomerRepository;
	
	@Autowired
	DataSource dataSource;
    
	@RequestMapping(value = "/Registered", method = {RequestMethod.POST})
	public @ResponseBody String getRegistered(@RequestParam Map<String,Object> param){
		logger.info("=============== getRegistered ======================");
		logger.info("請求參數:[{}]",param);
		
		
		
		logger.info("=============== getRegistered ======================");
		
		return "結束";
	}
	
    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public @ResponseBody Map<String,Object> getLoginSystem(@RequestParam Map<String,Object> param){
		logger.info("=============== getLoginSystem ======================");
		logger.info("請求參數:[{}]",param);
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		Map<String,String> resultMap = new HashMap<String,String>();
		map.put("resp_code", "000000");
		resultMap.put("identity", "000000");
		resultMap.put("token", "000000");
		resultMap.put("merchantId", "000000");
		resultMap.put("parent", "000000");
		resultMap.put("Name", "000000");
		
		map.put("result", resultMap);
		logger.info("=============== getLoginSystem ======================");
        
        return map;
    }
}
