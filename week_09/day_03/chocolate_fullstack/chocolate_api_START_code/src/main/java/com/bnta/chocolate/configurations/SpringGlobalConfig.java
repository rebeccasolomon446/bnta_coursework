package com.bnta.chocolate.configurations;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringGlobalConfig implements WebMvcConfigurer {

    // change cors mapping by telling how to do cors mapping
    // can modify how cors is behaving on the app
    public void addCorsMappings(CorsRegistry registry)  {

        registry.addMapping("/**")               // any path is fine, wild card. can also specify end points
                .allowedOrigins("*")                        //origins are url patterns, accepting all kinds
                .allowedHeaders("*")                        // enabling headers for requests. things like Host, Accept, Referer etc
                .allowedMethods("*");                       // can specify HTTP Requests here
    }
}
