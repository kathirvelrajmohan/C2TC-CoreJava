package com.cg.daythree;

public class EncapsulationMethod {
	private int id;
	private String name;
	private String mail;
	private long mobile;
	public EncapsulationMethod(int id, String name, String mail, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.mobile = mobile;
	}
	public EncapsulationMethod() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Student Details [id=" + id + ", name=" + name + ", mail=" + mail + ", mobile=" + mobile + "]";
	}
	

}
