package com.cts.irctc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.cts.irctc.skeletonvalidator.SkeletonValidator;

@SpringBootApplication
@Component("com.cts.*")
public class IrctcApplication {

	public static void main(String[] args) {
		SpringApplication.run(IrctcApplication.class, args);
		
	}

}
