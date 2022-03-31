package java_lc_cc.Payment_Data_Migration;

import java.util.*;

public class CreditCard {
	
	private String cardNumber;
	private Date cardExpire;
	private String name;
	private Integer cvv;
	
	public CreditCard(String cardNumber, Date cardExpire, String name, Integer cvv) {
		this.cardNumber = cardNumber;
		this.cardExpire = cardExpire;
		this.name = name;
		this.cvv = cvv;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Date getCardExpire() {
		return cardExpire;
	}
	public void setCardExpire(Date cardExpire) {
		this.cardExpire = cardExpire;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCvv() {
		return cvv;
	}
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}
	
}
