package com.test.vehicle;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class vehiclepojo implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@Id	
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idv")
	private int idv;
	
	@Column(name = "type")
	private String type;
	
	@Column
	private String name;
	
	@Column
	private int  yor;
	
	@Column
	private int  seats;
	
	@Column
	private int pno;
	
	@Column
	private String mailid;
	
	@Column
	private int pin;
	
	@Column
	private double mileage;
	
	public vehiclepojo(int idv,String type, String name, int yor, int seats, double d, int pin,int
			pno, String mailid) {
		super();
		this.idv = idv;
		this.type = type;
		this.name = name;
		this.yor = yor;
		this.seats = seats;
		this.mileage = d;
		this.pin = pin;
		this.pno = pno;
		this.mailid = mailid;
	}
	public vehiclepojo() {
		 
	}
	
	public int getId() {
		return idv;
	}
	public void setId(int idv) {
		this.idv = idv;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYor() {
		return yor;
	}
	public void setYor(int yor) {
		this.yor = yor;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public double getMileage() {
		return mileage;
	}
	
	public void setMileage(long mileage) {
		this.mileage = mileage;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

}
