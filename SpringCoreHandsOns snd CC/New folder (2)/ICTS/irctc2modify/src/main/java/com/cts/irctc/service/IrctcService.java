package com.cts.irctc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.irctc.model.Login;
//import com.cts.irctc.model.Login;
import com.cts.irctc.model.Traininfo;

@Service
public class IrctcService  {
	@Autowired
	TrainRepo trainRepo;
	
	@Autowired
	LoginRepo loginRepo;
	
	//Login login = new Login(); 
	
	 public List<Traininfo> findBytrain(String trainfrom , String trainto) {
		 List<Traininfo> train = trainRepo.findAll();
		 List<Traininfo> train1 = new ArrayList<Traininfo>();
		 for (Traininfo traininfo : train) {
			 if(traininfo.getTrainfrom().equalsIgnoreCase(trainfrom) && traininfo.getTrainto().equalsIgnoreCase(trainto)) {
				 train1.add(traininfo);
			 }
			
		}
		return train1;
	 }
		public Boolean login1(String user , String password) {
			List<Login> l = new ArrayList<Login>();
			
			l = loginRepo.findAll();
			
			Boolean t = false;
			for (Login login : l) {	
				if((login.getUser().equalsIgnoreCase(user) && login.getPassword().equalsIgnoreCase(password)))
					t = true;				
			}
			//System.out.println(user + password +t + " "+ login.);
			return t;
			
		}
		
		
		
	
	
}
