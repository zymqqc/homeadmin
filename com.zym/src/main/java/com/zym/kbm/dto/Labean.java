package com.zym.kbm.dto;

import java.util.Date;

public class Labean {
	private String laname;
	private Date createdate;
	private String overview;
	private String detail;
	
	public Labean() {
		super();
	}
	public Labean(String laname, Date createdate, String overview, String detail) {
		super();
		this.laname = laname;
		this.createdate = createdate;
		this.overview = overview;
		this.detail = detail;
	}
	public String getLaname() {
		return laname;
	}
	public void setLaname(String laname) {
		this.laname = laname;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
}
