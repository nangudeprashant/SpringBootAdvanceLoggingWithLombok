package com.javaLive.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class SpringBootAdvanceLoggingWithZeroConfigApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootAdvanceLoggingWithZeroConfigApplication.class, args);
		log.info("=========This is info level log message.===================");
		log.trace("=========This is trace level log message.===================");
		log.debug("=========This is debug level log message.===================");
		log.warn("=========This is warn level log message.===================");
		log.error("=========This is error level log message.===================");
	}

}
