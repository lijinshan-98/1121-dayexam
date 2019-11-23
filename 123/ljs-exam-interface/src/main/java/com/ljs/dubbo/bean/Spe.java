package com.ljs.dubbo.bean;

import java.io.Serializable;

public class Spe implements Serializable{
	private int id;
	private String cname;
	private String doing;
	private String people;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDoing() {
		return doing;
	}
	public void setDoing(String doing) {
		this.doing = doing;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public Spe(int id, String cname, String doing, String people) {
		super();
		this.id = id;
		this.cname = cname;
		this.doing = doing;
		this.people = people;
	}
	public Spe() {
		super();
	}
	@Override
	public String toString() {
		return "Spe [id=" + id + ", cname=" + cname + ", doing=" + doing + ", people=" + people + "]";
	}
	
	
	
}
