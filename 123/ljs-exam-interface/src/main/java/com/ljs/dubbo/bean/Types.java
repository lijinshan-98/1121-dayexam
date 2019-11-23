package com.ljs.dubbo.bean;

import java.io.Serializable;

public class Types implements Serializable{
	private int tid;
	private String tname;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Types(int tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	public Types() {
		super();
	}
	@Override
	public String toString() {
		return "Type [tid=" + tid + ", tname=" + tname + "]";
	}
	
}
