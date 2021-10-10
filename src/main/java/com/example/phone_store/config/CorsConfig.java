package com.example.phone_store.config;

/**
 * 全局配置跨域问题会导致报500错误，所以先用 @CrossOrigin(origins = "*",maxAge = 3600) 解决
 */
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class CorsConfig implements WebMvcConfigurer {
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("*")
//                .allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS")
//                .allowCredentials(true)
//                .maxAge(3600)
//                .allowedHeaders("*");
//    }
//}



