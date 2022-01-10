package com.nt.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer{
	
	private Integer cno;
	private String cname;
	private Float billAmt;
	private String[]favColors;
	private List<String>studies;
	private Set<Integer>phoneNo;
	
	public String[] favColors() {
		return favColors;
	}
	public void setFavColors(String[] favColors) {
		this.favColors = favColors;
	}
	public List<String> getStudies() {
		return studies;
	}
	public void setStudies(List<String> studies) {
		this.studies = studies;
	}
	public Set<Integer> getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Set<Integer> phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Map<String, Object> getIdDetails() {
		return idDetails;
	}
	public void setIdDetails(Map<String, Object> idDetails) {
		this.idDetails = idDetails;
	}
	public Company getComapny() {
		return comapny;
	}
	public void setComapny(Company comapny) {
		this.comapny = comapny;
	}
	public Customer(Integer cno, String cname, Float billAmt, String[] gavColors, List<String> studies,
			Set<Integer> phoneNo, Map<String, Object> idDetails, Company comapny) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.billAmt = billAmt;
		this.favColors = gavColors;
		this.studies = studies;
		this.phoneNo = phoneNo;
		this.idDetails = idDetails;
		this.comapny = comapny;
	}
	private Map<String,Object>idDetails;
	private Company comapny;
	
	public Customer(Integer cno, String cname, Float billAmt) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.billAmt = billAmt;
	}
	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", billAmt=" + billAmt + ", favColors="
				+ Arrays.toString(favColors) + ", studies=" + studies + ", phoneNo=" + phoneNo + ", idDetails="
				+ idDetails + ", comapny=" + comapny + "]";
	}
	public Customer() {
		super();
	}
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Float getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(Float billAmt) {
		this.billAmt = billAmt;
	}
	
	
	
	

}
