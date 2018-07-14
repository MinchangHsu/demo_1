package com.example.demo.controller;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
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
    
    
    @RequestMapping(value = "/test", method = {RequestMethod.POST})
    public @ResponseBody String testHTML(@RequestParam Map<String,Object> param){
    	logger.info("=============== getOrderData ======================");
    	logger.info("請求參數:[{}]",param);
    	
    	Map<String,Object> map = new HashMap<String,Object>();
    	
    	Map<String,String> resultMap = new HashMap<String,String>();
    	
    	String surl = "http://www.layui.com/demo/table/user/?";
    	
    	String charset = "UTF-8";
    	String data = "page="+param.get("page")+"&limit="+param.get("limit");
    	
 		BufferedWriter wr = null;
 		String returnMessage = null;
 		try {
 	        URL url = new URL(surl+data);
 	        HttpURLConnection URLConn = (HttpURLConnection) url.openConnection(); 
 	   
 	        BufferedReader rd = new BufferedReader(new java.io.InputStreamReader(URLConn.getInputStream(),charset)); 
 	        String line;
 	        while ((line = rd.readLine()) != null) {
 	            returnMessage = line;
 	        }
 	        rd.close();
 	      } catch (IOException IOE) {
 	          logger.error("doGet happen IOException :{}"+IOE.getMessage());
 	      } finally { 
 	        if (wr != null) {
 	            try { 
 	                wr.close(); 
 	            } catch (IOException IOE) {
 	                logger.error("doGet happen IOException :{}"+IOE.getMessage());
 	            } 
 	            wr = null; 
 	        } 
 	      }
// 		logger.info("回傳摻數:[{}]",returnMessage);
 		logger.info("=============== getOrderData ======================");
 	      return returnMessage; 
 	}
}
