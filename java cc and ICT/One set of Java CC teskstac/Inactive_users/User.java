package java_lc_cc.Inactive_users;

import java.io.*;
import java.util.*;
import java.sql.*;
public class User 
{
	private Integer id;
	private String username;
	private String password;
	private String address;
	private String mobileNumber;
	private Integer failedAttempts;
	private Integer deleted;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Integer getFailedAttempts() {
		return failedAttempts;
	}
	public void setFailedAttempts(Integer failedAttempts) {
		this.failedAttempts = failedAttempts;
	}
	public Integer getDeleted() {
		return deleted;
	}
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
	public User(Integer id,String username,String password,String address,String mobileNumber,Integer deleted)
	{
	    super();
	    this.id = id;
	    this.username = username;
	    this.password = password;
	    this.address = address;
	    this.mobileNumber = mobileNumber;
	    this.deleted = deleted;
	    
	}


}

