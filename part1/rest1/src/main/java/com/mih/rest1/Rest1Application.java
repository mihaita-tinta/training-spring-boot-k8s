package com.mih.rest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class Rest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Rest1Application.class, args);
	}
	
/*    @RequestMapping("/")
    public String root() {
    	return "hello-k8s";
    }
	*/
}
