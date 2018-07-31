package cn.net.nikai.cloud.adminhystrix;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class AdminHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminHystrixApplication.class, args);
	}
}
