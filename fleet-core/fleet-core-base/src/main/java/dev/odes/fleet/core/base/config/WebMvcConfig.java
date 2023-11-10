package dev.odes.fleet.core.base.config;

import dev.odes.fleet.core.base.interceptor.RequestInterceptor;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        WebMvcConfigurer.super.addCorsMappings(registry);

        // 当前跨域请求最大有效时长。这里默认30天
        final long maxAge = 30 * 24 * 60 * 60;
        registry.addMapping("/**")
            .allowCredentials(true)
            .maxAge(maxAge)
            .allowedOrigins("*")
            .allowedHeaders("*")
            .allowedMethods("GET", "POST", String.valueOf(RequestMethod.PUT), String.valueOf(RequestMethod.PATCH))
            .exposedHeaders("*");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);

        registry.addInterceptor(new RequestInterceptor())
            .addPathPatterns("/**")
            .excludePathPatterns("/public/**");
    }

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
