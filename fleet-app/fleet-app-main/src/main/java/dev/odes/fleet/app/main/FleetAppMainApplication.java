package dev.odes.fleet.app.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"dev.odes.fleet.develop.**.mapper", "dev.odes.fleet.core.**.mapper"})
@ComponentScan(basePackages = {"dev.odes.fleet.core.**", "dev.odes.fleet.develop.*"})
public class FleetAppMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(FleetAppMainApplication.class, args);
	}

}
