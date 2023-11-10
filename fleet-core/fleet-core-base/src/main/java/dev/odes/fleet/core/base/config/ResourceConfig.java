package dev.odes.fleet.core.base.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
public class ResourceConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        WebMvcConfigurer.super.addResourceHandlers(registry);

        File file = new File("public");
        if (!file.exists()) {
            boolean mkdir = file.mkdir();
        }
        registry
            .addResourceHandler("/public/**")
            .addResourceLocations(file.toURI().toString());
    }
}
