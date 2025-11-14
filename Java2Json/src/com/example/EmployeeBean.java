package com.example;

public class EmployeeBean {
	private int eid;
	private String ename;
	private int esal;
	private int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}

}
