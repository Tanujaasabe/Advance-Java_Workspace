package com.api.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {
	
	//before,after 
	 private static final Logger logger =LoggerFactory.getLogger(LoggingAspect.class);

	    @Before("execution(* com.tka.service.*.*(..))")
	    public void beforeExecution() {
	        logger.info("Method started...");
	    }
	    
	    @After("execution(* com.tka.service.*.*(..))")
	    public void afterExecution() {
	        logger.info("Method ented...");
	    }
	    
	    
	

}
