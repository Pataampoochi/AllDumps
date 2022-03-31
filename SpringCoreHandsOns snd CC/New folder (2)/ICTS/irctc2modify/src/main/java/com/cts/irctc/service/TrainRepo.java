package com.cts.irctc.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.irctc.model.Traininfo;

public interface TrainRepo extends JpaRepository<Traininfo, Integer>{
	
//	@Query("from Traininfo where trainfrom = ?1")
//	List<Traininfo> findBytrain(String trainfrom);
//	List<Traininfo> findByTrainNumberGreaterThan(int trainNumber);
}
