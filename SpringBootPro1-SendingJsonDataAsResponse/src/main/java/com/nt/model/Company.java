package com.nt.model;

public class Company {
	public Company(String name, String address, String type, int size) {
		this.name=name;
		this.address=address;
		this.type=type;
		this.size=size;
	}
	private String	name;
	private String address;
	private String type;
	private Integer size;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", address=" + address + ", type=" + type + ", size=" + size + "]";
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
