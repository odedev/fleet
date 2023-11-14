package dev.odes.fleet.core.asset.config;

import dev.odes.fleet.core.asset.constant.FileConstant;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
public class ResourceFileConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        WebMvcConfigurer.super.addResourceHandlers(registry);

        File file = new File(FileConstant.PUBLIC_PATH);
        if (!file.exists()) {
            boolean mkdir = file.mkdir();
        }
        registry
            .addResourceHandler("/public/**")
            .addResourceLocations(file.toURI().toString());
    }
}

