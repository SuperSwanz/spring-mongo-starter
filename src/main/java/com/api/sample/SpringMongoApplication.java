package com.api.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(scanBasePackages = { "com.api.sample"}, exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@SpringBootApplication(scanBasePackages = { "com.api.sample"})
@ComponentScan({ "com.api.sample" })
@EnableConfigurationProperties
@EnableAutoConfiguration
public class SpringMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(new Object[] { SpringMongoApplication.class}, args);
	}
}