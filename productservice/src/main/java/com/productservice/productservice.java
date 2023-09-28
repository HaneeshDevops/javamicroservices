package com.productservice;
// MAY 17TH LAST CHANGE
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class productservice {

	public static void main(String[] args) {
		SpringApplication.run(productservice.class, args);
	}

}
