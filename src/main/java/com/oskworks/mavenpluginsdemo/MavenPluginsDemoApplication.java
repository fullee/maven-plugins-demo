package com.oskworks.mavenpluginsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@SpringBootApplication
public class MavenPluginsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenPluginsDemoApplication.class, args);
	}

}
