package com.springProject_ms.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="appointment")
@Entity
public class Registration {
	
//	@GeneratedValue
//	private int id ;
	
	@Id
	private String username;
//	 public int getId() {
//		return id;
//	}
//	
//	public void setId(int id) {
//		this.id = id;
//	}
	
	 
	private String name;
	
	   private int age;
      
	   private String password;
       
	   // private String cpassword;
      
	   private long contact;
      
	   private String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//	public String getCpassword() {
//		return cpassword;
//	}
//	public void setCpassword(String cpassword) {
//		this.cpassword = cpassword;
//	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Registration(String username, String name, int age, String password, long contact,
			String email) {
		super();
		this.username = username;
		this.name = name;
		this.age = age;
		this.password = password;
	//	this.cpassword = cpassword;
		this.contact = contact;
		this.email = email;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
		}
	


