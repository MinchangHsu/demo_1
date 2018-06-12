package com.example.demo.controller;


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
@RequestMapping("/aa")
public class UserLoginController {
	
	private static final Logger logger = LogManager.getLogger(UserLoginController.class);
	
	@Autowired
	helloService helloService1;
	
	@Autowired
	CustomerRepository CustomerRepository;
	
	@Autowired
	DataSource dataSource;
    
    @RequestMapping(value = "/hello", method = {RequestMethod.POST})
    public @ResponseBody String getHealth(@RequestParam Map<String,Object> param){
        System.out.println("我已經進入Controller");
        System.out.println("我是參數:"+param);
        
        List<MinTbCustomerJpa> list = CustomerRepository.findAll();
        System.out.println("list.size:"+list.size());
        MinTbCustomerJpa test = list.get(0);
        System.out.println(test.getCustomerId());
        System.out.println(test.getCreatName());
        System.out.println(test.getCustomerAddr());
        System.out.println(test.getCustomerContact());
        System.out.println(test.getCustomerUserId());
        System.out.println(test.getCustomerFax());
        
        
        logger.info("================== start ================================");
        logger.debug("********************************************************");
        logger.debug("********************************************************");
        logger.debug("****************6666666666666666666666******************");
        logger.debug("********************************************************");
        logger.debug("********************************************************");
        logger.debug("********************************************************");
        logger.debug("********************************************************");
        logger.debug("********************************************************");
        logger.debug("********************************************************");
        logger.debug("********************************************************");
        logger.debug("********************************************************");
        logger.debug("********************************************************");
        logger.debug("********************************************************");
        logger.debug("********************************************************");
        logger.debug("********************************************************");
        logger.debug("********************************************************");
        logger.debug("****************6666666666666666666666******************");
        logger.info("==================  end  ================================");

       
        
        System.out.println("========================================");
        
        MinTbCustomerJpa test3 = CustomerRepository.findByCustomerUserIdAndCustomerOpertora("666123",96385214);
        System.out.println(test3.getCustomerId());
        System.out.println(test3.getCreatName());
        System.out.println(test3.getCustomerAddr());
        System.out.println(test3.getCustomerContact());
        System.out.println(test3.getCustomerUserId());
        System.out.println(test3.getCustomerFax());

        
        return "結束";
    }
}
