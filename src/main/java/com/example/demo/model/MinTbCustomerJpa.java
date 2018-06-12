package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "min_tb_customer")
public class MinTbCustomerJpa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUSTOMER_ID")
	private int customerId;
	@Column(name="CUSTOMER_USE_ID")
	private String customerUserId;
	@Column(name="CUSTOMER_NAME")
	private String customerName;
	@Column(name="CUSTOMER_OPERTOR")
	private int customerOpertora;
	@Column(name="CUSTOMER_ADDR")
	private String customerAddr;
	@Column(name="CUSTOMER_TELPHONE")
	private String customerTelphone;
	@Column(name="CUSTOMER_FAX")
	private String customerFax;
	@Column(name="CUSTOMER_CONTACT")
	private String customerContact;
	@Column(name="CUSTOMER_CONTACT_PHONE")
	private String customerContactPhone;
	@Column(name="CREATE_NAME")
	private String creatName;
	@Column(name="CREATE_TIME")
	private Date creatTime;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerUserId() {
		return customerUserId;
	}
	public void setCustomerUserId(String customerUserId) {
		this.customerUserId = customerUserId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerOpertora() {
		return customerOpertora;
	}
	public void setCustomerOpertora(int customerOpertora) {
		this.customerOpertora = customerOpertora;
	}
	public String getCustomerAddr() {
		return customerAddr;
	}
	public void setCustomerAddr(String customerAddr) {
		this.customerAddr = customerAddr;
	}
	public String getCustomerTelphone() {
		return customerTelphone;
	}
	public void setCustomerTelphone(String customerTelphone) {
		this.customerTelphone = customerTelphone;
	}
	public String getCustomerFax() {
		return customerFax;
	}
	public void setCustomerFax(String customerFax) {
		this.customerFax = customerFax;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public String getCustomerContactPhone() {
		return customerContactPhone;
	}
	public void setCustomerContactPhone(String customerContactPhone) {
		this.customerContactPhone = customerContactPhone;
	}
	public String getCreatName() {
		return creatName;
	}
	public void setCreatName(String creatName) {
		this.creatName = creatName;
	}
	public Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	
	
	

}
