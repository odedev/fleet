package dev.odes.fleet.app.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"dev.odes.fleet.app.**.mapper", "dev.odes.fleet.core.**.mapper", "dev.odes.fleet.module.**.mapper", "dev.odes.fleet.tool.**.mapper"})
@ComponentScan(basePackages = {"dev.odes.fleet.app.*", "dev.odes.fleet.core.*", "dev.odes.fleet.module.*", "dev.odes.fleet.tool.*", "dev.odes.fleet.component.*"})
public class FleetAppMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(FleetAppMainApplication.class, args);
	}

}
