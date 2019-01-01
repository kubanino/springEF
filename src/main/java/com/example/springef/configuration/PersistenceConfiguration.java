package com.example.springef.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.springef.domain.mappers")
public class PersistenceConfiguration
{

}
