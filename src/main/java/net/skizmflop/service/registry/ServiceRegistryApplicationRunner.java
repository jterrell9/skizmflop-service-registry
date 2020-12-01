package net.skizmflop.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplicationRunner.class, args);
	}
}
