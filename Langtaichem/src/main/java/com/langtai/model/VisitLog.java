package com.langtai.model;

import java.sql.Date;
import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * 记录访问信息
 * @author wang
 */
@Entity
public class VisitLog {

	private int id;
	private String ip; //访客ip
	private String address; //访客地址
	private Date date; //访问日期
	private Time time; //访问时间
	private Set<Product> produces; //浏览过的产品
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	
	@ManyToMany()
	@JoinTable(name="visit_log_product", joinColumns={ @JoinColumn(name="vid")}, inverseJoinColumns={ @JoinColumn(name="pid")})
	public Set<Product> getProduces() {
		if (produces == null) {
			this.produces =new HashSet<Product>();
		}
		return produces;
	}
	public void setProduces(Set<Product> produces) {
		this.produces = produces;
	}
	
	@Override
	public String toString() {
		return "VisitLog [id=" + id + ", ip=" + ip + ", address=" + address + ", date=" + date + ", time=" + time
				+ ", produces=" + produces + "]";
	}
	
}
