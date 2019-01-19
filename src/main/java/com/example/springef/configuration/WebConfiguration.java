package com.example.springef.configuration;

import com.example.springef.formatters.USLocalDateFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.LocalDate;

@Configuration
public class WebConfiguration implements WebMvcConfigurer
{
    public void addFormatters(FormatterRegistry registry)
    {
        registry.addFormatterForFieldType(LocalDate.class, new USLocalDateFormatter());
    }
}
