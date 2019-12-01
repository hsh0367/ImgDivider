package com.sweetk.ImgDivider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan(basePackages = {"com.sweetk"})
public class ImgDividerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImgDividerApplication.class, args);
	}

}
