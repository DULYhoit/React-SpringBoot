package com.app.entity;

public class Register {
	private String regname;
	private String regid;
	private String regpw;
	private String regemail;
	private String regbd;
	private int regage;
	private String regsex;
	private String phone;
	public Register() {
		
	}
	public Register(String regname, String regid, String regpw, String regemail, String regbd, int regage,
			String regsex) {
		
		this.regname = regname;
		this.regid = regid;
		this.regpw = regpw;
		this.regemail = regemail;
		this.regbd = regbd;
		this.regage = regage;
		this.regsex = regsex;
	}
	
	public String getRegname() {
		return regname;
	}
	public void setRegname(String regname) {
		this.regname = regname;
	}
	public String getRegid() {
		return regid;
	}
	public void setRegid(String regid) {
		this.regid = regid;
	}
	public String getRegpw() {
		return regpw;
	}
	public void setRegpw(String regpw) {
		this.regpw = regpw;
	}
	public String getRegemail() {
		return regemail;
	}
	public void setRegemail(String regemail) {
		this.regemail = regemail;
	}
	public String getRegbd() {
		return regbd;
	}
	public void setRegbd(String regbd) {
		this.regbd = regbd;
	}
	public int getRegage() {
		return regage;
	}
	public void setRegage(int regage) {
		this.regage = regage;
	}
	public String getRegsex() {
		return regsex;
	}
	public void setRegsex(String regsex) {
		this.regsex = regsex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Register [regname=" + regname + ", regid=" + regid + ", regpw=" + regpw + ", regemail=" + regemail
				+ ", regbd=" + regbd + ", regage=" + regage + ", regsex=" + regsex + "]";
	}
	
	
}
