package com.example.demo.config;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan
public class WebConfig extends WebMvcConfigurerAdapter {
	private static final Logger logger = LoggerFactory.getLogger(WebConfig.class);
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/index.html");
    }
    
    
//	@Value("${mysql.DataSource}")
//	private String mySqlDataSource;

//	@Autowired
//	@Bean(name = "DataSource", destroyMethod = "")
//	public JndiObjectFactoryBean soaDataSource(Properties apServerProps) throws Exception {
//		logger.info("### ApplicationConfig.JndiObjectFactoryBean initialing.[{}]", mySqlDataSource);
//		JndiObjectFactoryBean DataSource = new JndiObjectFactoryBean();
//		DataSource.setJndiName(mySqlDataSource);
//		DataSource.setJndiEnvironment(apServerProps);
//		logger.info("### ApplicationConfig.JndiObjectFactoryBean initialed.");
//		return DataSource;
//	}
}
