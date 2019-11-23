package com.ljs.dubbo.bean;

import java.io.Serializable;

public class User implements Serializable{
	private int uid;
	private String uname;
	private String udoing;
	private int unum;
	private String uover;
	private String upeople;
	private int tid;
	private Types tp;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUdoing() {
		return udoing;
	}
	public void setUdoing(String udoing) {
		this.udoing = udoing;
	}
	public int getUnum() {
		return unum;
	}
	public void setUnum(int unum) {
		this.unum = unum;
	}
	public String getUover() {
		return uover;
	}
	public void setUover(String uover) {
		this.uover = uover;
	}
	public String getUpeople() {
		return upeople;
	}
	public void setUpeople(String upeople) {
		this.upeople = upeople;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public Types getTp() {
		return tp;
	}
	public void setTp(Types tp) {
		this.tp = tp;
	}
	public User(int uid, String uname, String udoing, int unum, String uover, String upeople, int tid, Types tp) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.udoing = udoing;
		this.unum = unum;
		this.uover = uover;
		this.upeople = upeople;
		this.tid = tid;
		this.tp = tp;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", udoing=" + udoing + ", unum=" + unum + ", uover=" + uover
				+ ", upeople=" + upeople + ", tid=" + tid + ", tp=" + tp + "]";
	}
	
	
	
	
}
