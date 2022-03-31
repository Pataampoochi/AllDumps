package com.cts.irctc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Traininfo {
	@Id
	private int trainNumber;
	private String trainfrom;
	private String trainto;
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTrainfrom() {
		return trainfrom;
	}
	public void setTrainfrom(String trainfrom) {
		this.trainfrom = trainfrom;
	}
	public String getTrainto() {
		return trainto;
	}
	public void setTrainto(String trainto) {
		this.trainto = trainto;
	}
	public Traininfo(int trainNumber, String trainfrom, String trainto) {
		super();
		this.trainNumber = trainNumber;
		this.trainfrom = trainfrom;
		this.trainto = trainto;
	}
	public Traininfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Traininfo [trainNumber=" + trainNumber + ", trainfrom=" + trainfrom + ", trainto=" + trainto + "]";
	}
	
	


}