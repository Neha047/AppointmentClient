package com.springProject_ms.Model;

import java.sql.Date;

import javax.persistence.Column;
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
@Table(name="BookAppoints")
@Entity
public class BookAppoint {
	
      @Id	
      @GeneratedValue
	  public int bid;
      
      @Column(length = 4)
	  public String name;
      @Column(length = 4)
	  public String email;
      @Column(length = 10)
	  public int contact;
      @Column(length = 4)
	  public String  department;
      @Column(length = 4)
	  public Date date;
	  public BookAppoint() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookAppoint(String name, String email, int contact, String department, Date date, String message,
			String doctor) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.department = department;
		this.date = date;
		this.message = message;
		this.doctor = doctor;
	}
	 @Column(length = 4)
	public String message;
	 @Column(length = 4)
	  public String doctor;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
}

