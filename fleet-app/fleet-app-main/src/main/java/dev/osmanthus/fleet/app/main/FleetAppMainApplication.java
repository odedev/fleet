package dev.osmanthus.fleet.app.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"dev.osmanthus.fleet.app.**.mapper", "dev.osmanthus.fleet.core.**.mapper", "dev.osmanthus.fleet.module.**.mapper", "dev.osmanthus.fleet.tool.**.mapper"})
@ComponentScan(basePackages = {"dev.osmanthus.fleet.app.*", "dev.osmanthus.fleet.core.*", "dev.osmanthus.fleet.module.*", "dev.osmanthus.fleet.tool.*", "dev.osmanthus.fleet.component.*"})
public class FleetAppMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(FleetAppMainApplication.class, args);
	}

}
