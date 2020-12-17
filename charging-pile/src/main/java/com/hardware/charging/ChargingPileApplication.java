package com.hardware.charging;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.hardware.charging","com.hardware.common.key"})
public class ChargingPileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChargingPileApplication.class, args);
	}
}
