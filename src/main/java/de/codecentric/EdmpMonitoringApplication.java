package de.codecentric;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class EdmpMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdmpMonitoringApplication.class, args);
	}
}
