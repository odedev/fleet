package dev.odes.fleet.core.base.config;

import dev.odes.fleet.common.constant.PresetConstant;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
public class ResourceConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        WebMvcConfigurer.super.addResourceHandlers(registry);

        File file = new File(PresetConstant.PUBLIC_PATH);
        if (!file.exists()) {
            boolean mkdir = file.mkdir();
        }
        registry
            .addResourceHandler("/public/**")
            .addResourceLocations(file.toURI().toString());
    }
}
