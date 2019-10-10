package com.liuxu.shop.domain;

public class Goodskind {
	private Integer zid;
	private String zname;
	public Integer getZid() {
		return zid;
	}
	public void setZid(Integer zid) {
		this.zid = zid;
	}
	public String getZname() {
		return zname;
	}
	public void setZname(String zname) {
		this.zname = zname;
	}
	public Goodskind(Integer zid, String zname) {
		super();
		this.zid = zid;
		this.zname = zname;
	}
	public Goodskind() {
		super();
	}
	
	
}
