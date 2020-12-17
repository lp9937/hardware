package com.hardware.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={"com.hardware.common.utils","com.hardware.server"})
public class HardwareServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HardwareServerApplication.class, args);
	}
}
