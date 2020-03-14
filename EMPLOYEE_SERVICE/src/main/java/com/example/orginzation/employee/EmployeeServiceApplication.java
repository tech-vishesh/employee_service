package com.example.orginzation.employee;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class EmployeeServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

	@Autowired
    DataSource dataSource;
	
	@Value("${spring.datasource.url}")
	String connection;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("DATASOURCE = " + connection);

    }
}
