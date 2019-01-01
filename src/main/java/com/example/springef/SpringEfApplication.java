package com.example.springef;

import com.example.springef.executors.MainExecutor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.springef.ApplicationContextProvider.getContext;

@SpringBootApplication
public class SpringEfApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SpringEfApplication.class, args);

        final MainExecutor mainExecutor = getContext().getBean(MainExecutor.class);
        mainExecutor.execute();
    }
}
