package com.langtai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class ProductOrder {

	private Integer id;
	private String productName = "未填写";
	private String name = "未填写";
	private String company = "未填写";
	private String address = "未填写";
	private String tel = "未填写";
	private String fax = "未填写";
	private String web = "未填写";
	private String email = "未填写";
	private String note = "未填写";
	private String fromAddress = "未填写";
	private String toAddress = "未填写";
	private String subject = "未填写";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Type(type="text")
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "ProductOrder [id=" + id + ", productName=" + productName + ", name=" + name + ", company=" + company
				+ ", address=" + address + ", tel=" + tel + ", fax=" + fax + ", web=" + web + ", email=" + email
				+ ", note=" + note + ", fromAddress=" + fromAddress + ", toAddress=" + toAddress + ", subject=" + subject + "]";
	}
	
}
