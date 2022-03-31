package com.cts.irctc.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.irctc.model.Login;

public interface LoginRepo extends JpaRepository<Login, String>{
	
//	@Query("from Traininfo where trainfrom = ?1")
//	List<Traininfo> findBytrain(String trainfrom);
//	List<Traininfo> findByTrainNumberGreaterThan(int trainNumber);
}
