package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableTransactionManagement
@EnableAutoConfiguration
@SpringBootApplication
//@EnableScheduling
@RequestMapping("/demo")
public class DemoApplication {
	@RequestMapping("/hello")
	@ResponseBody
	String welcome(){
		return "hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
