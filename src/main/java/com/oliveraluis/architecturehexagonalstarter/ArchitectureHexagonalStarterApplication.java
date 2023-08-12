package com.oliveraluis.architecturehexagonalstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
@EnableFeignClients("com.oliveraluis.architecturehexagonalstarter.*.infrastructure.outbound.external")
@SpringBootApplication
@ImportAutoConfiguration({FeignAutoConfiguration.class})
public class ArchitectureHexagonalStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArchitectureHexagonalStarterApplication.class, args);
	}

}
