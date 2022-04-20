package com.spring.main;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.exception.NoProfitException;
import com.spring.model.FitnessFranchise;
import com.spring.service.FitnessService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// fill the code
		Scanner sc = new Scanner(System.in);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

		System.out.println("Pink Fitness Franchise 1 details");
		System.out.println("Enter the total location:");
		String location = sc.next();
		System.out.println("Enter the total income:");
		double totalIncome = sc.nextDouble();
		System.out.println("Enter total expense amount for trainer salary:");
		double trainerSalary = sc.nextDouble();
		FitnessFranchise fitnessFranchise1 = (FitnessFranchise) applicationContext.getBean("fitnessFranchise");
		fitnessFranchise1.setLocation(location);
		fitnessFranchise1.setTotalIncome(totalIncome);
		fitnessFranchise1.setTrainerSalary(trainerSalary);
		System.out.println("Pink Fitness Franchise 2 details");
		System.out.println("Enter the total location:");
		String location2 = sc.next();
		System.out.println("Enter the total income:");
		double totalIncome2 = sc.nextDouble();
		System.out.println("Enter total expense amount for trainer salary:");
		double trainerSalary2 = sc.nextDouble();
		FitnessFranchise fitnessFranchise2 = (FitnessFranchise) applicationContext.getBean("fitnessFranchise");
		fitnessFranchise2.setLocation(location2);
		fitnessFranchise2.setTotalIncome(totalIncome2);
		fitnessFranchise2.setTrainerSalary(trainerSalary2);

		FitnessService fitnessService = (FitnessService) applicationContext.getBean("fitnessService");
		try {

			fitnessService.calculateNetProfit(fitnessFranchise1);
			System.out.println("Pink Fitness at " + fitnessFranchise1.getLocation() + " franchise Amount is RS:"
					+ fitnessFranchise1.getFranchiseAmount());
		} catch (NoProfitException e) {
			System.out.println(e.getMessage());
		}
		try {

			fitnessService.calculateNetProfit(fitnessFranchise2);
			System.out.println("Pink Fitness at " + fitnessFranchise2.getLocation() + " franchise Amount is RS:"
					+ fitnessFranchise2.getFranchiseAmount());
		} catch (NoProfitException e) {
			System.out.println(e.getMessage());
		}

	}

}
