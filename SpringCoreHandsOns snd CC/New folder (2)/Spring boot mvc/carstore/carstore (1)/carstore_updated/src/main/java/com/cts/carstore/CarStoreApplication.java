package com.cts.carstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.cts.carstore.skeletonvalidator.SkeletonValidator;

@SpringBootApplication
@ComponentScan("com.cts.carstore.*")
public class CarStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarStoreApplication.class, args);

		new SkeletonValidator();
	}

}
