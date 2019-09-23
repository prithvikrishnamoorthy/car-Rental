package com.test.vehicle;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BookingVehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private Date startdate;
	@Column
	private Date enddate;

	@Column
	private String customername;

	@Column
	private int customerno;

	@Column
	private String mailid;

	@ManyToOne
	@JoinColumn(name = "idv")
	private vehiclepojo vehiclepojo;

	public BookingVehicle(int id, Date startdate, Date enddate, vehiclepojo vehiclepojo, String customername,
			int customerno, String mailid) {
		super();
		this.id = id;
		this.startdate = startdate;
		this.enddate = enddate;
		this.vehiclepojo = vehiclepojo;
		this.customername = customername;
		this.customerno = customerno;
		this.mailid = mailid;
	}

	public BookingVehicle() {

	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getCustomerno() {
		return customerno;
	}

	public void setCustomerno(int customerno) {
		this.customerno = customerno;
	}

	public vehiclepojo getVehiclepojo() {
		return vehiclepojo;
	}

	public void setVehiclepojo(vehiclepojo vehiclepojo) {
		this.vehiclepojo = vehiclepojo;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
}
