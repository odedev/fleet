package dev.odes.fleet.core.file.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;
import java.io.FileNotFoundException;

@Configuration
public class WebFileConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        WebMvcConfigurer.super.addResourceHandlers(registry);

        File file;
        try {
            file = ResourceUtils.getFile("public/");
        } catch (FileNotFoundException e) {
            file = new File("/public/");
        }
        System.out.println("source-----" + file.getAbsolutePath());

        registry.addResourceHandler("/public/**")
            .addResourceLocations("file://" + file.getAbsolutePath() + "/");
    }
}
