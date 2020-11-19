package com.hardware.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.hardware.common,com.hardware.server"})
public class HardwareServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HardwareServerApplication.class, args);
	}
}
